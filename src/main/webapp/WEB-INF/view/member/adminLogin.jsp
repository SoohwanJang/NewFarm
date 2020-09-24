<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <main class="main">
	    <section class="content-container">
	        <h1 class="d-none">로그인 메인</h1>
	        <div class="path">
	            <ol>
	                <li>
	                    <a href="../index"> </a>
	                </li>
	                <li>
	                    <a href="adminLogin">관리자 로그인</a>
	                </li>
	            </ol>
	        </div>
	        <section class="login-main-section">
	            <h1 class="d-none">로그인</h1>
	            <header>
	                <div class="login-intro">
	                    <span>반갑습니다</span>
	                    <img src="../images/logo.png"><span>관리자 로그인 페이지입니다.</span>
	                </div>
	            </header>
	            <form action="adminLogin" method="post" class="login-form">
	                <input type="text" name="username" placeholder="아이디" />
	                <input type="password" name="password" placeholder="비밀번호">
	                <input type="submit" value="로그인">
	            </form>
	            
	           	<ul class="find-button-list">
	                <li><a href="/member/login" class="search-pop-button">회원 로그인 하기</a></li>
	            </ul>

			<!--  
	            <ul class="link-button-list">
	                <li><button class="naver-link-button">네이버 로그인</button></li>
	                <li>
	                	<a href="https://kauth.kakao.com/oauth/authorize?client_id=24cb3312dfb1fb6f4064e3f2188160da&redirect_uri=http://localhost:8080/member/kakaologin&response_type=code">
		                	<button class="kakao-link-button">카카오톡 로그인</button>
		                </a>
	                </li>
	            </ul>
	
	            <div class="anonymous-container">
	                <button class="anonymous-button">비회원 구매 조회</button>
	            </div>
	        -->
	        </section>
	    </section>
    </main>
    
    <script src="/js/member/login.js"></script>
