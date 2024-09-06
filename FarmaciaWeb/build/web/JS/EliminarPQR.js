/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function () {
    $("tr .btneliminarpqr").click(function () {
        event.preventDefault();
        
    var idp = $(this).parent().find(".idpqr").val();
    console.log("ID PQR:", idp);
        swal({
            title: "¿Esta seguro que lo desea eliminar?",
            text: "Una vez eliminado, podra seguir comprando más productos!",
            icon: "warning",
            buttons: true,
            dangerMode: true
        })
                .then((willDelete) => {
                    if (willDelete) {
                        eliminar(idp);
                        swal("Poof! El articulo ha sido eliminado!", {
                            icon: "success"
                        }).then((willDelete) => {
                            if (willDelete) {
                                console.log("elimino");
                                parent.location.href = "CtrPQR?accion=listarPQR";
                            }
                        });
                    } else {
                        swal("Articulo no eliminado!");
                    }
                });
    });

    function eliminar(idp) {
        var url = "CtrPQR?accion=eliminarPQR";
        $.ajax({
            type: 'POST',
            url: url,
            data: {idp: idp},
            success: function (data, textStatus, jqXHR) {
                console.log("PQR eliminado");
            }
        });
    }
});


