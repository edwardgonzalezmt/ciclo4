function ingresar() 
{
    
    var usermail = $("#useremail").val();
    var password = $("#password").val();

    $.ajax({
        url: "http://129.151.110.141:8080/api/user/"+usermail+"/"+password,
        //url:"http://localhost:8080/api/user/"+usermail+"/"+password,
        type: "GET",
        data: {email : usermail, password : password},
        dataType: "json",
        success : function (data) {
            if (data.id == null)
            {
                alert("Usuario No existe o Contraseña errada");

            }
            else
            {
                alert("Bienvenido "+ usermail)
            }
        }       
        
    })
 
}  
