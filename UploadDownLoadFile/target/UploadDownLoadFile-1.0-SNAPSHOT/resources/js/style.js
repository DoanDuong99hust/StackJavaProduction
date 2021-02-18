$(document).ready(function() {
    var exist = false;

    $('#formUploadFile').submit(function(e) {
        e.preventDefault();

        $(this).ajaxSubmit({
            beforeSubmit: function() {
                resetProgressBar();
            },
            uploadProgress: function (event, position, total, percentComplete){
                console.log(percentComplete+"");
                $("#progressbar").width(percentComplete + '%');
                if (percentComplete < 100) {
                    $("#status").html(percentComplete + '%');
                }
                if (percentComplete == 100) {
                    $("#status").html("Saving...");
                }
            },
            success:function (responseText, statusText, xhr){
                $("#status").html("Completed!");
                $("#progressbar").removeClass('progress-bar-striped active')
            },
            error: function(responseText, statusText, xhr){
                resetProgressBar();
                console.log(responseText);
                console.log(statusText);
                console.log(xhr);
            },
            //url:       url         // override for form's 'action' attribute
            type:      'POST',        // 'get' or 'post', override for form's 'method' attribute
            //dataType:  null        // 'xml', 'script', or 'json' (expected server response type)
            clearForm: true,        // clear all form fields after successful submit
            resetForm: true        // reset the form after successful submit
        });
    });


    function resetProgressBar() {
        $("#progressbar").width(0 + '%');
        $("#progressbar").addClass('progress-bar-striped active')
        $("#status").html(0 + '%');
    }
});
