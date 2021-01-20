<%--
  Created by IntelliJ IDEA.
  User: pasandep
  Date: 07.11.2020
  Time: 01:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>О нас</title>
    <link rel="stylesheet" type="text/css" href="/style/AboutUsPageStyle.css">
</head>
<body>
<header>
    <a href="/homePage"><img src="/img/RaznostMneniiPNG.png" id="logo"></a>
    <a href="/ProfileServlet"><button id="toSignInBtn"><%=request.getSession().getAttribute("buttonValue")%></button></a>
    <div class="menu-sections">
        <div class="dropdown-news">
            <a class="menu-sections-btns" id="dropbtn-news" href="/homePage">ГЛАВНАЯ</a>
            <div class="dropdown-content-news">
                <a href="/homePage?id=1">Единая Россия</a>
                <a href="/homePage?id=2">КПРФ</a>
                <a href="/homePage?id=3">ЛДПР</a>
                <a href="/homePage?id=4">СР</a>
            </div>
        </div>
        <a class="menu-sections-btns" href="/GovernmentPageServlet">ГОСУСТРОЙСТВО</a>
        <a class="menu-sections-btns" href="#">ГОСДУМА</a>
        <div class="dropdown-consignments">
            <a class="menu-sections-btns" id="dropbtn-consignments" href="#">ПАРТИИ</a>
            <div class="dropdown-content-consignments">
                <a href="/ConsignmentPage?id=1">Единая Россия</a>
                <a href="/ConsignmentPage?id=2">КПРФ</a>
                <a href="/ConsignmentPage?id=3">ЛДПР</a>
                <a href="/ConsignmentPage?id=4">СР</a>
            </div>
        </div>
        <a class="menu-sections-btns" href="/PutinPageServlet">ПУТИН</a>
        <a class="menu-sections-btns" href="/RegionsPageServlet">РЕГИОНЫ</a>
        <a id="current-menu-section" class="menu-sections-btns" href="/AboutUsServlet">О НАС</a>
    </div>
</header>
<center><h2>О НАС</h2></center>
<img src="img/Lyapustin.jpg" id="Lyapa">
<h3>Ляпустин Никита</h3>
<p>Возраст: 18(или 19 точно не могу сказать)</p>
<p>Рост: 176</p>
<p>Вес: АХхАХАхХАХхАхАХах</p>
<p>Роль: front</p>
<p>Отзыв: Салют! Сначала у меня не было никакого понимания того, что я вообще пишу. Какие сессии, какие куки лол.
Однако, уже после первой сдачи всё пошло как по маслу. Не совсем помню, в какой именно момент появилось понимание того,
что я делаю, но оно пришло и отлично. Сначала было сложно работать в команде, потому что не до конца понимали кто какую логику сайта
хочет видеть. Сейчас на самом деле тоже не до конца понимаем, но однако стало намного проще понимать, что хочет напарник
и как сделать таски так, чтобы он был доволен. Семестровка круто, как сдадим пойду досматривать 470-500 серии Наруто.</p>
<br>
<br>
<br>
<br>
<br>
<br>
<div class="SosNiContent">
    <img src="img/Sosyuk.jpg" id="SosNi">
    <h3>Cосюк Никита</h3>
    <p>Возраст: 19</p>
    <p>Рост: 180></p>
    <p>Вес: 63</p>
    <p>Роль: back-end девелопер, но вообще желательно iosDev</p>
    <p>Отзыв: Мне ваще ничего сложного не было блин потому чувак ты классно подходишь к семестровке потому что типа тебе не пофиг ты реально делаешь поэтому
        ваще зашибись ну дримтим получилось вроде как ну конечно херня то что мы не понимаем чо как в голове у кого складывается но вроде реально зашибись получилось изи баллы мне кажется</p>
</div>
</body>
</html>
