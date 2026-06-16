package in.cdac.BootMvcHiber.beans;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileModel {
	
	MultipartFile fileAttachement;
	
	
	public void setFileAttachment(MultipartFile fileAttachment) {
		this.fileAttachement = fileAttachment;
	}
	
	public MultipartFile getFileAttachment() {
		return fileAttachement;
	}
	
}
