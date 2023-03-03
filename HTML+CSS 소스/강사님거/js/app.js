
$(document).ready(function(){
  menu()
  slide()
  tab()
  popup()
})

function menu(){
  $(".gnb>li").hover(
    function(){//mouseover
      $(".lnb").stop().slideDown()
    },
    function(){//mouseout
      $(".lnb").stop().slideUp()
    }
  )
}

function slide(){
  setInterval(slideMove,1000)
}

var idx = 0; //슬라이드 인덱스
var curTop = 0;//현제 top위치
function slideMove(){
  
  idx++;
  curTop = -300 * idx;
  if(curTop == -900){
    curTop = 0;
    idx = 0;
  }

  $("#slide_contents").animate({"top":curTop})
}

function tab(){
}
function popup(){

}
