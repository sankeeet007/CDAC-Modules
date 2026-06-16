package in.cdac.BootMvcHiber.controller;

import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;

import in.cdac.BootMvcHiber.beans.FileModel;

@Controller
public class UploadFileController {

	@Autowired
	StandardServletMultipartResolver resolver;
	
	@RequestMapping("/uploadFile")
	public void prepareFileUpload(Model data) {
		data.addAttribute("fileToUpload", new FileModel());
	}
	
	@RequestMapping(path="/fileUploaded", method = RequestMethod.POST)
	public String uploadFile(@ModelAttribute("fileToUpload")FileModel fileModel) {
		
		try (FileOutputStream fos = new FileOutputStream("D:\\BATCH 2\\ModulesPractice\\Web Java\\Assignments" + fileModel.getFileAttachment().getOriginalFilename())) {
			fos.write(fileModel.getFileAttachment().getBytes());
			return "fileUploadedSuccess";
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "uploadFile";
	}
}
