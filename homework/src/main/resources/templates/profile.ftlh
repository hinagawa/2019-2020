
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Профиль</title>
    <style>
        html{
            background-color: dodgerblue;
        }
        fieldset {
            position: absolute;
            right: 460px;
            width: 550px;
            height: 300px;
            background-color: white;
            top: 50px;
            border-radius:10px;

        }
        .puk{
            position: absolute;
            right: 480px;
            top:450px;

        }

    </style>

    <link rel="stylesheet" href="https://cdn.shoelace.style/1.0.0-beta.25/shoelace.css">
</head>
<body>
<fieldset>
<div ><h1>  Name ${user.name} </h1></div>
<div > <h1> Email  ${user.email} </h1> </div>
    <div > <h1> Role ${user.role} </h1> </div>
</fieldset>
<div class="puk">
    <#if user.role=="ADMIN">
    <a href="http://localhost:8080/adminRoutes" class="button button-light button-xl active">Добавить маршрут</a>
    </#if>


<a href="http://localhost:8080/map" class="button button-light button-xl active">Карта</a>
<a href="http://localhost:8080/routes" class="button button-light button-xl active">Все маршруты</a>
<a href="http://localhost:8080/index" class="button button-light  button-xl active">Найти попутчика</a>
</div>
</body>
</html>