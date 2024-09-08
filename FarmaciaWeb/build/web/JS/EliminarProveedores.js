/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function () {
   
    $("tr .btndelete").click(function (event) {
        event.preventDefault();
        
        var idp = $(this).parent().find(".idprov").val(); 
        console.log("ID PQR:", idp);
        
       
        Swal.fire({
            title: "¿Estás seguro?",
            text: "Una vez eliminada, podrás seguir gestionando las PQR.",
            icon: "warning",
            showCancelButton: true,
            confirmButtonColor: "#559D46", 
            cancelButtonColor: "#94DD81",  
            confirmButtonText: "Sí, eliminar",
            cancelButtonText: "Cancelar",
            customClass: {
                popup: 'animated fadeInDown faster' 
           }     
        }).then((result) => {
            if (result.isConfirmed) {
                eliminar(idp); 
                Swal.fire({
                    title: "¡Eliminada!",
                    text: "La PQR ha sido eliminada exitosamente.",
                    icon: "success",
                    confirmButtonColor: "#74BD64",  
                    customClass: {
                        popup: 'animated fadeOutUp faster'  
                    }
                }).then(() => {
                    console.log("PQR eliminada con éxito");
                    parent.location.href = "CtrProveedores?accion=listarProveedores"; 
                });
            } else {
                Swal.fire({
                    title: "Cancelado",
                    text: "La PQR no se ha eliminado.",
                    icon: "error",
                    confirmButtonColor: "#B4FD9F"  
                });
            }
        });
    });

   
    function eliminar(idp) {
        var url = "CtrProveedores?accion=eliminar"; 
        $.ajax({
            type: 'POST',
            url: url,
            data: { idp: idp }, 
            success: function (data, textStatus, jqXHR) {
                console.log("PQR eliminada correctamente");
            },
            error: function (jqXHR, textStatus, errorThrown) {
                console.log("Error al eliminar la PQR:", errorThrown); 
            }
        });
    }
});
