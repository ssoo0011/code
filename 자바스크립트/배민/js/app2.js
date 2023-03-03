//html에서 화면이 다 만들어지면 실행되는 함수! 이걸 해주면 맨 위에서
//자바스크립트 링크를 써도 된다!
document.addEventListener("DOMContentLoaded", function(){   
    document.getElementById('confirm-btn').addEventListener('click', confirmCheck) //확인버튼!           
    mainMenuClickEnroll()
    sideMenuClickEnroll()
    addMenu()
    decMenu()
})

var num = 1

function confirmCheck(){

    alert("선택하셨습니다.")

    var radiobtn = document.getElementsByClassName("main-menu")
    var checkBtn = document.getElementsByClassName("side-menu")

    for(var i = 0; i < radiobtn.length ; i++){
        if(radiobtn[i].checked === true){
            alert(radiobtn[i].value)
        }
    }

    for(var i = 0; i < checkBtn.length ; i++){
        if(checkBtn[i].checked === true){
            alert(checkBtn[i].value)
        }
    }
}

function mainMenuClickEnroll(){ //라디오 버튼에 클릭 이벤트 등록하는 함수
    var radiobtn = document.getElementsByClassName("main-menu")
    for(var i = 0; i<radiobtn.length ; i++){
            radiobtn[i].addEventListener('click', sumPrice )     
    }

}

function sideMenuClickEnroll(){ //라디오 버튼에 클릭 이벤트 등록하는 함수
    var checkBtn = document.getElementsByClassName("side-menu")
    for(var i = 0; i<checkBtn.length ; i++){
        checkBtn[i].addEventListener('click', sumPrice )     
    }

}

function sumPrice(e){
   
    var sum = 0
    var radiobtn = document.getElementsByClassName("main-menu")
    var checkBtn = document.getElementsByClassName("side-menu")
    var sumprice = document.getElementById("total-price-count")
    var totlaprice = document.getElementById("total-price-count")

    for(var i = 0; i < radiobtn.length ; i++){
        sumprice = parseInt(e.target.value)
        if(radiobtn[i].checked === true){
            sum += sumprice          
        }
    }

    for(var i = 0; i < checkBtn.length ; i++){
        sumprice = parseInt(e.target.value)
        if(checkBtn[i].checked === true){
            sum += sumprice
        }
    } 
    // alert(sum)
    totlaprice.innerText = sum
    return sum
  
}

function addMenu(){
    var add = document.getElementById("inc-btn")
    add.addEventListener('click', addcount)

}

function addcount(){
    var sum = sumPrice()
    var totlaprice = document.getElementById("total-price-count")
    var count = document.getElementById("item-count")
    num++
    count.innerText = num
    totlaprice.innerText = sum*num
}

function decMenu(){
    var dec = document.getElementById("dec-btn")
    dec.addEventListener('click', deccount)
}

function deccount(){
    var sum = sumPrice()
    var totlaprice = document.getElementById("total-price-count")
    var count = document.getElementById("item-count")
    num--
    if(num < 1){
        num = 1
        alert("뺄 메뉴가 없당 !")
    }
    count.innerText = num
    totlaprice.innerText = sum*num
     

}
