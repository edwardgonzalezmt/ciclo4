
function consultar()
{

    var name = $("#username").val();
    var email = $("#useremail").val();
    var password = $("#password").val();
    var passwordrepeat = $("#passwordrepeat").val();
    
    if(password != passwordrepeat)
    {
        alert("Las contraseñas no coinciden")
    }
    else
    {
        
        $.ajax({
            url: "http://129.151.110.141:8080/api/user/"+email,
            //url: "http://localhost:8080/api/user/"+email,
            type: "GET",
            data: {email},
            dataType: "json",
            success : function (data) {
                
                if (data == true)
                {
                    alert("Ya existe usuario");
    
                }
                else
                {
                    alert("Bienvenido "+ email);
                    var data2 = {
                        "email": email,
                        "password": password,
                        "name": name
                    }
                    
                    $.ajax({
                        url:"http://129.151.110.141:8080/api/user/new",
                        //url:"http://localhost:8080/api/user/new",
                        type: "POST",
                        dataType: "json",
                        contentType:"application/json",
                        data: JSON.stringify(data2),
                        statuscode:{
                            201: function () {
                                console.log("creado");
                                alert("Usuario guardado con exito");               
                                
                            }
                        }
                    })
                }
            }       
            
        })
    
    }
  
}