<!doctype html>
<html class="no-js" lang="en" xmlns:th="http://www.w3.org/1999/xhtml">
<style>
    .nav_position{
        position: absolute;
        right: 50px;
        top: 10px;
    }
    .nav_size{
        width: 300px;
        height: 40px;

    }
    i {
        position: absolute;
        top:-10px;

    }
    h1 {
        font-family: 'Raleway', sans-serif;
        font-size: x-large;

        position: absolute;
        top:300px;
        left:550px;


    }


</style>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Hello</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">


    <nav>
        <div class="nav-wrapper light-green darken-3">
            <ul class="left hide-on-med-and-down">
                <li class="active"><a href="/hello">Home</a></li>
                <li><a href="/allnote">All notes</a></li>
                <li><a href="/note">Note</a></li>
            </ul>
        </div>
    </nav>


</head>
<body>
<h1 >Hello, ${name}</h1>
<script type="text/javascript" src="js/materialize.min.js"></script>
</body>
</html>
