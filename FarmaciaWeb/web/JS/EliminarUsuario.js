/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



$(document).ready(function () {

    $("tr .btneliminar").click(function (event) {
        event.preventDefault();

        var idu = $(this).parent().find(".id").val(); 
        console.log("ID Usuario:", idu);

        Swal.fire({
            title: "¿Estás seguro?",
            text: "Una vez eliminado el usuario no se prodra recuperar.",
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
                eliminar(idu); 
                Swal.fire({
                    title: "¡Eliminado!",
                    text: "El usuario ha sido eliminado exitosamente.",
                    icon: "success",
                    confirmButtonColor: "#74BD64",
                    customClass: {
                        popup: 'animated fadeOutUp faster'
                    }
                }).then(() => {
                    console.log("Usuario eliminado con éxito");
                    parent.location.href = "CtrUsuarioCre?accion=eliminar"; 
                });
            } else {
                Swal.fire({
                    title: "Cancelado",
                    text: "El usuario no se ha eliminado.",
                    icon: "error",
                    confirmButtonColor: "#B4FD9F"
                });
            }
        });
    });

    function eliminar(idu) { 
        var url = "CtrUsuarioCre?accion=eliminar"; 
        $.ajax({
            type: 'get', 
            url: url,
            data: { id: idu }, 
            success: function (data, textStatus, jqXHR) {
                console.log("Usuario eliminado correctamente");
            },
            error: function (jqXHR, textStatus, errorThrown) {
                console.log("Error al eliminar el usuario:", errorThrown);
            }
        });
    }

});
