<!doctype html>
<html lang="en" xmlns:th="http://www.w3.org/1999/xhtml">
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
    .size-card{
        width: 500px;
        border-radius: 10px 10px;
    }
    .pos{
       position: absolute;
        left:500px;
    }
    .down{
        position: absolute;
        left:600px;
        top:600px;
    }

</style>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <title>All</title>

    <nav>
        <div class="nav-wrapper light-green darken-3">
            <ul class="left hide-on-med-and-down">
                <li><a href="/hello">Home</a></li>
                <li class="active"><a href="/allnote">All notes</a></li>
                <li ><a href="/note">Note</a></li>
            </ul>
        </div>
    </nav>
    <nav class="nav_position nav_size  green darken-4">
        <div class="nav-wrapper">
            <form>
                <div class="input-field">
                    <input id="find" type="search" required>
                    <label class="label-icon" for="search">
                        <i class="material-icons">search</i>
                    </label>
                </div>
            </form>
        </div>
    </nav>




<body>
    <div class="pos">
        <#if notes?has_content>
        <#list notes as note>
            <div class="col s12 m7 size-card">
                <div class="card horizontal">

                    <div class="card-stacked">
                        <div class="card-content">

                            <ul>
                                <li>${note.title}  ${note.text}</li>
                            </ul>

                        </div>
                    </div>
                </div>
            </div>

        </#list>
        <#else>
        List is empty
        </#if>

    <#if pages?? && pages != 0>
        <nav >
            <ul class="pagination">
                <#list 1..pages as page>
                    <li>
                        <a class="active" href="/allnote?page=${page}" >${page}</a>
                    </li>
                </#list>
            </ul>
        </nav>
    </#if>

</div>
<script type="text/javascript" src="js/materialize.min.js"></script>

</body>
</html>