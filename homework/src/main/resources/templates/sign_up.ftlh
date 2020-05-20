<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Register</title>
    <style>

        body, html{height:100%; width: 100%; }

        body{
            background-color: darkcyan;
            background-size: cover;
        }


        .mainPlace{
            height: 100%;
            width: 100%;
            display: flex;
            align-items: center;
            justify-content: center;
            background-size: cover;
        }

        .group{
            position:relative;
            margin-bottom:35px;
        }

        .loginPlace{
            position: relative;

            height: 385px;
            width: 360px;
            background-color: #ffffff;
            border-radius: 4px;
            box-shadow: 0 20px 40px 0 rgba(0,0,0,.5);
        }

        .loginTag{
            height: 118px;
        }

        .loginInputs{

        }

        .loginDivPlace{
            height: 100%;
            display: flex;
            align-items: center;
            justify-content: center;
        }

        .loginSpan{
            font-family: "Yandex Sans Display Bold", sans-serif;
            font-size: 28pt;
            color: #333333;
            cursor: default;
        }

        input{
            font-size:18px;
            padding:10px 10px 10px 5px;
            display:block;
            width:300px;
            border:none;
            border-bottom:1px solid #757575;
        }

        input:focus{
            outline:none;
            border-bottom-color: #25aae1;
        }

        label 				 {
            color:#999;
            font-size:18px;
            font-weight:normal;
            position:absolute;
            pointer-events:none;
            left:5px;
            top:10px;
            transition:0.4s ease all;
        }

        input:focus ~ label, input:valid ~ label{
            top:-20px;
            font-size:14px;
            color: #25aae1;
        }


        .group{
            width: 300px;
            margin-left: 30px;
        }

        .loginButtonDiv{
            margin-left: 85px;
            margin-top: 45px;
        }

        .loginButton{
            background-image: linear-gradient(to right, #25aae1, #40e495, #30dd8a, #2bb673);
            background-size: 250% 100%;
            text-transform: uppercase;
            color: #ffffff;
            width: 190px;
            height: 40px;
            border-radius: 25px;
            font-size: 10pt;
            border: none;
            cursor: pointer;
            transition: background-position .4s ease-in-out;
        }

        .loginButton:hover{
            outline: none;
            background-position: 100% 0;
            transition: all .4s ease-in-out;
        }




    </style>
    <link rel="stylesheet" href="https://cdn.shoelace.style/1.0.0-beta.25/shoelace.css">
</head>
<body>
<div class="mainPlace">
    <div class="loginPlace">
        <div class="loginTag">
            <div class="loginDivPlace">
                <span class="loginSpan">Регистрация</span>
            </div>
        </div>
        <div class="loginInputs">
            <form action="/signUp" method="POST">
                <div class="group">
                    <input type="text" name="name" >
                    <span class="bar"></span>

                    <label id="loginLabel" >Юзернейм</label>
                </div>
                <div class="group">
                    <input type="email" name="email" >
                    <span class="bar"></span>
                    <label id="email">Email</label>
                </div>
                <div class="group">
                    <input type="password" name="password" >
                    <span class="bar"></span>
                    <label id="passwordLabel">Пароль</label>
                </div>

                <div class="loginButtonDiv">
                    <button class="loginButton" type="submit">Зарегистрироваться</button>
                </div>
            </form>
        </div>
    </div>
</div>

</body>
</html>

