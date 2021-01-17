<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Cinemagic - Watch Movies Online!</title>
    <style>
      * {box-sizing: border-box;}

      body {
        margin: 0;
        font-family: Arial, Helvetica, sans-serif;
        background: url(https://www.itl.cat/pngfile/big/46-465731_streaming-movies.jpg);
      }

      h1 {
        color: white;
        font-size: 40px;
      }

      p{
        color: white;
        font-size: 20px;
      }

      a:link, a:visited {
        color: red;
      }

      .header {
        overflow: hidden;
        background-color: #f1f1f1;
        padding: 20px 10px;
      }

      .header a {
        float: left;
        color: black;
        text-align: center;
        padding: 12px;
        text-decoration: none;
        font-size: 18px;
        line-height: 25px;
        border-radius: 4px;
      }

      .header a.logo {
        font-size: 25px;
        font-weight: bold;
      }

      .header a:hover {
        background-color: #ddd;
        color: black;
      }

      .header a.register {
        background-color: dodgerblue;
        color: white;
      }

      .header-right {
        float: right;
      }

      @media screen and (max-width: 500px) {
        .header a {
          float: none;
          display: block;
          text-align: left;
        }

        .header-right {
          float: none;
        }
      }
</style>
  </head>
  <body>

    <div class="header">
      <a href="" class="logo">Cinemagic✨</a>
      <div class="header-right">
        <a class="login" href="http://localhost:8000/login">Log In</a>
        <a class="register" href="http://localhost:8000/register">Register</a>
      </div>
    </div>

    <div style="text-align: center; margin: 0; position: absolute; top: 30%; left: 50%;
    -ms-transform: translate(-50%, -50%); transform: translate(-50%, -50%);">
      <h1>Free unlimited movies and TV shows!</h1>
      <p>Watch anytime, anywhere.</p>
      <p>Ready to watch? <a href="http://localhost:8000/register">Register</a> now!</p>
    </div>

  </body>
</html>