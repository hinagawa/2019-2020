<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Admin</title>

    <style>

        html{
            background-color: dodgerblue;
        }

fieldset{
    background-color: white;
    width: 80%;
    height: 90%;
    position: absolute;
    left:100px;
    top:50px;
}
        .loginButton{
            background-image: linear-gradient(to right, #25aae1, #40e495, #30dd8a, #2bb673);
            background-size: 250% 100%;
            text-transform: uppercase;
            color: #ffffff;
            width: 190px;
            height: 40px;
            border-radius: 25px;
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
        <fieldset>
            <form action="/adminRoutes" method="post">
                <h3 >Откуда</h3>
                    <input type="text" id="from_country" name="fromcountry">
                <h3 style="margin-top: 2%">Куда</h3>
                    <input type="text"  id="to_country" name="tocountry">

                <h3 style="margin-top: 2%">Дата yy.mm.dd hh:mm</h3>
                    <input type="text" id="time" name="time">

                    <h3 style="margin-top: 2%">Транспорт</h3>
                    <select id="transport" name="transport">
                        <option>Самолет</option>
                        <option>Поезд</option>
                        <option>Автобус</option>
                    </select>
                <h3 style="margin-top: 2%">Время в пути</h3>
                    <input type="text" id="duration" name="duration">

                    <button style="margin-top: 5%" class="loginButton" id="button"  type="submit">Отправить</button>

            </form>
        </fieldset>


</body>
</html>
