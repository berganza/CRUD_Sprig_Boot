function eliminar(id){
	swal({
		  title: "Estas seguro de Eliminar?",
		  text: "Una vez borrado, no se podrá recuperar la información !!!",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((OK) => {
		  if (OK) {
			  $.ajax({
				  url:"/eliminar/"+id,
				  success: function(res) {
					console.log(res); 
				},
			  });
			  
		    swal("Bueno... pues se ha borrado !!!", {
		      icon: "success",
		    }).then((ok)=>{
		    	if(ok){
		    		location.href="/listar";
		    	}
		    });
		  } else {
		    swal("Anulado el borrado !!!");
		  }
		});
}