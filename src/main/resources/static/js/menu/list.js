window.addEventListener("load", function(){
	//let btnSubmit = document.querySelector(".form-section input[type=submit]")
	let fromSection = document.querySelector(".form-section")
	let findButton = document.querySelector(".btn-find")
	let queryInput = document.querySelector(".input-query"); // document에서 입력객체 얻기 
	
	findButton.onclick= function(e){
		e.preventDefault();
		
		let query = queryInput.value; // 입력객체의 속성에서입력값을 
		
		console.log(query);


	}
});

window.addEventListener("load", function(){
	let categorySerch = document.querySelector("")
});

