<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8">

 
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <link rel="stylesheet" href="css/nav.css">
  <link rel="stylesheet" href="css/font-awesome.min.css">
  <link rel="stylesheet" href="css/shop.css">
   <script type="text/javascript" src="js/fontawesome.js"></script>
  
   <script src="https://kit.fontawesome.com/35a849c95f.js" crossorigin="anonymous"></script>
 <link rel = "icon" href = "item/ico.png"  type = "image/x-icon">
 
 <title>Spring MVC</title>
 <base href="${pageContext.servletContext.contextPath}/">
</head>
<body>
<meta charset="utf-8">
	<nav class="navbar navbar-expand-lg bg-dark navbar-light d-none d-lg-block" id="templatemo_nav_top">
          <div class="container text-light ">
            <div class="w-54 d-flex justify-content-between">
              <i class="fa-solid fa-envelope mx-2"></i>
              <a class="navbar-sm-brand text-blue text-decoration-none " href="mailto:futures@company.com">futures@company.com</a>
              <i class="fa fa-phone mx-2"></i>
              <a class="navbar-sm-brand text-blue text-decoration-none " href="tel:010-020-0340">666</a>
            </div>
            <div>
              <a class="text-light" href="https://www.facebook.com/tran.bao.92317/" target="_blank" rel="sponsored"><i class="fab fa-facebook-f fa-sm fa-fw me-2"></i></a>
              <a class="text-light" href="https://www.instagram.com/" target="_blank"><i class="fab fa-instagram fa-sm fa-fw me-2"></i></a>
              <a class="text-light" href="https://twitter.com/" target="_blank"><i class="fab fa-twitter fa-sm fa-fw me-2"></i></a>
              <a class="text-light" href="https://www.linkedin.com/" target="_blank"><i class="fab fa-linkedin fa-sm fa-fw me-2"></i></a>
              <a class="text-light" href="https://www.youtube.com/watch?v=dQw4w9WgXcQ" target="_blank"><i class="fa-brands fa-youtube fa-sm fa-fw mx-2"></i></a>
            </div>
          </div>
        </nav>
        
          <nav class="navbar navbar-expand-lg navbar-light shadow">
          <div class="container d-flex justify-content-between align-items-center">
            <a class="navbar-brand text-success logo h align-self-center " href="">Futures</a>
            <div class="align-self-center collapse navbar-collapse flex-fill  d-lg-flex justify-content-lg-between" id="templatemo_main_nav">
              <div class="flex-fill ">
                <ul class="nav navbar-nav d-flex  justify-content-flex-start ">
                    <li class="nav-item ">
                        <a class="nav-link  " href="">Home</a>
                    </li>
                    <li class="nav-item ">
                      <a class="nav-link " href="/WEB_SHOP/about.htm">About</a>
                   </li>
                   <li class="nav-item">
                    <a class="nav-link" href="/WEB_SHOP/shop.htm">Shop</a>
                   </li>
                   
                     
                 
                
              
                   
                   
                    <div  class="navbar ul  ">
                      <p>&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp </p>
                      <p>&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp </p>
                      <p>&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp </p>
                      <p>&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp </p>                      
                     <a class="nav-icon d-none d-lg-inline" href="#" data-bs-toggle="modal" data-bs-target="#templatemo_search">
                        <i class="fa fa-fw fa-search text-dark mr-2"></i>
                     </a>
                      <p>&nbsp &nbsp &nbsp</p>
                     <a class="nav-icon  " href="">
                        <i class="fa fa-fw fa-cart-arrow-down text-dark mr-1"></i>
                     </a>
                      <p>&nbsp &nbsp &nbsp</p>
                     <a class="nav-icon  " href="/WEB_SHOP/user.htm">
                        <i class="fa fa-fw fa-user text-dark mr-3"></i>
                     </a>
                 </div>
                 
                </ul>
             </div>
            </div>
          </div>
        </nav>
        
        <h1>dsadasd</h1>
     
        <form action="success.htm" method="post">
           <div>Tên Đăng Nhập</div>
           <input name="login">
  
           <div>Mật Khẩu</div>
           <input name="pass">
  
           <div>Tên Người Dùng</div>
           <input name="ten">
  
           <div>Điện Thoại</div>
           <input name="phone">
           
           <div>Email</div>
           <input name="email"> 
           <hr>
            <button name="save">save</button>
        </form>
    
        
    
     <script src="js/box.js"></script>
     
</body>
</html>