<!doctype html>
<html lang="en">
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
.input-field label {
    color: white;
}
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

.form {
    padding: 15px;
}

.form-item {
    display: inline-block;
    vertical-align: top;
    position: relative;
}

.form-input {
    width: 100%;
    height: 40px;
    padding: 5px 15px;
}

.form-label {
    position: absolute;
    pointer-events: none;
    left: 15px;
    top: 0;
    line-height: 40px;
    transition: .3s;
}

.form-input:focus~.form-label,
.form-input:not(:focus):valid~.form-label {
    top: -10px;
    font-size: 10px;
}
    .title-input-position{
        position: absolute;
        left:20px;
        top:100px;
        width: 350px;
        height: 250px;
    }
    .text-input-position{
        position: absolute;
        left:20px;
        top:200px;
        width: 350px;
        height: 250px;
    }
    .button-position{
        position: absolute;
        left:50px;
        top:300px;
        width: 300px;
        height: 150px;

    }
    .form-position{
        position: absolute;
        left:500px;
        top:200px;
        border: 2px solid lightgreen;
        border-radius: 10px 10px;
        width: 400px;
        height: 400px;
    }
</style>

<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <title>Note</title>

    <nav>
        <div class="nav-wrapper light-green darken-3">
            <ul class="left hide-on-med-and-down">
                <li><a href="/hello">Home</a></li>
                <li><a href="/allnote">All notes</a></li>
                <li class="active"><a href="/note">Note</a></li>
            </ul>
        </div>
    </nav>


    <nav class="nav_position nav_size  green darken-4">
        <div class="nav-wrapper">

            <form>
                <div class="input-field">
                    <input id="search" type="search" required>
                    <label class="label-icon red " for="search">
                        <i class="material-icons">search</i>
                    </label>
                </div>
            </form>
        </div>
    </nav>


</head>
<body>
<form action="/note" method="post">
    <form class="form">
        <div class="form-position">
        <div class="form-item title-input-position ">
            <input type="text" name="title" class="form-input" required>
            <label class="form-label">Название</label>
        </div>
        <div class="form-item text-input-position">
            <input type="text" name="text" class="form-input" required>
            <label class="form-label">Текст</label>
        </div>
            <button class="btn waves-effect waves-light button-position green" type="submit" name="action">Submit
            </button>
        </div>
    </form>

</form>
    <script type="text/javascript" src="js/materialize.min.js"></script>

</body>
</html>