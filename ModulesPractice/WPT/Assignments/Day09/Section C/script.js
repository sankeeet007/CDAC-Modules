$(document).ready(function() {
    
    $('#addTask').on('click', function() {
        const taskText = $('#taskInput').val().trim();

        if (taskText !== "") {
            const newTask = `
                <li class="list-group-item d-flex justify-content-between align-items-center border-start-0 border-end-0 px-0">
                    <span class="task-text">${taskText}</span>
                    <button class="btn btn-outline-danger btn-sm delete">Delete</button>
                </li>`;
            
            $('#taskList').append(newTask);
            $('#taskInput').val(""); 
        } else {
            alert("Please enter a task!");
        }
    });

    $('#taskList').on('click', '.delete', function() {
        $(this).closest('li').fadeOut(300, function() {
            $(this).remove();
        });
    });

    $('#taskInput').on('keypress', function(e) {
        if (e.which === 13) {
            $('#addTask').click();
        }
    });
});