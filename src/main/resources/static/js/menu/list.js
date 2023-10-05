/* 클릭시 DOM 이벤트 발생*/
window.addEventListener("load", function(){
	/* 이벤트가 발생할 대상 변수 선언*/
  let formSection = document.querySelector(".form-section");
  let findButton = formSection.querySelector('.btn-find');
  let queryInput = formSection.querySelector('.input-query')
  
  btnSubmit.onclick = function(e) {
	  e.preventDefault();
	  
	  let query = queryInput.value;
	  
	  
  }
});