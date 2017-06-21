var searchFieldURL = "main/loadFileZZI";


$(document).on('submit', '.searchForm', function(e) {
	e.preventDefault();
	var searchField = $(this).find("input[name=searchField]").val();

	$.ajax({
		type : 'POST',
		url : searchFieldURL,
		contentType : 'application/xml',
		dataType : "text",
		data : formToXMLSearch(searchField),
		success : function(data) {
			if (data == "OK") {

				toastr.options = {
					"closeButton" : true,
					"debug" : false,
					"newestOnTop" : false,
					"progressBar" : false,
					"positionClass" : "toast-top-right",
					"preventDuplicates" : false,
					"onclick" : null,
					"showDuration" : "300",
					"hideDuration" : "1000",
					"timeOut" : "5000",
					"extendedTimeOut" : "1000",
					"showEasing" : "swing",
					"hideEasing" : "linear",
					"showMethod" : "fadeIn",
					"hideMethod" : "fadeOut"
				}
				toastr.info('File sent to Bank.');
				 
			}
			if (data == "ERROR") {

				toastr.options = {
					"closeButton" : true,
					"debug" : false,
					"newestOnTop" : false,
					"progressBar" : false,
					"positionClass" : "toast-top-right",
					"preventDuplicates" : false,
					"onclick" : null,
					"showDuration" : "300",
					"hideDuration" : "1000",
					"timeOut" : "5000",
					"extendedTimeOut" : "1000",
					"showEasing" : "swing",
					"hideEasing" : "linear",
					"showMethod" : "fadeIn",
					"hideMethod" : "fadeOut"
				}
				toastr.info('Error in reading file. Check file name!');
				 
			}
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			alert("AJAX ERROR: " + errorThrown);
		}
	});
	
});

function formToXMLSearch(searchField) {
	var vrati = "<pom><searchField>"+searchField+"</searchField></pom>";
	return vrati;
}