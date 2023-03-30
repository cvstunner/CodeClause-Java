let nav_link_auth = document.querySelectorAll(".nav-link-auth");

let auth_page = document.getElementsByClassName("auth-page");
let offcanvas_backdrop = document.getElementsByClassName("offcanvas-backdrop");
let auth_page_col = document.getElementsByClassName("auth-page-col");
let auth_page_body = document.getElementsByClassName("auth-page-body");

let signin_btn = document.getElementById('signin-btn');
let username_input = document.getElementById('username-input');
let password_input = document.getElementById('password-input');

let su_name_input = su_age_input = su_gender_input = su_email_input = su_username_input = su_pswd_input = su_cpswd_input = undefined;

var auth_page_bts = new bootstrap.Offcanvas(document.getElementsByClassName("auth-page")[0]);
// var myModal = new bootstrap.Modal(document.getElementById("exampleModalToggle"));


window.onload = () => {
	console.log("onload");
	if(window.sessionStorage.getItem('user') == null){
		auth_page_bts.show();
	}
	// auth_page[0].classList.remove('show');
	// auth_page[0].classList.add('show');
	// offcanvas_backdrop[0].classList.add('show');
}

// Event Listeners



// Event Handlers

// Method for Sign In
function signin_btn_clicked(){
	let username = username_input.value;
    query(`auth?u=${username}&p=${password_input.value}`, 'get', null, 'application/json', true, function(res){
        if(res[0] === 200){
			auth_page_bts.hide();
			window.sessionStorage.setItem('user', username);
			console.log(res[1]['map']['status']);
			if(res[1]['map']['status'] === 'admin'){
				window.sessionStorage.setItem('status', 'admin');
			}
			else{
				window.sessionStorage.setItem('status', 'user');
			}
        	console.log("Signed In!");
        }
        else if(res[0] === 404){
        }
    });
}



// Method for Sign Up
function signup_btn_clicked(){
	su_name_input = document.getElementById('su-name-input');
	su_age_input = document.getElementById('su-age-input');
	su_gender_input = document.getElementById('su-gender-input');
	su_email_input = document.getElementById('su-email-input');
	su_username_input = document.getElementById('su-username-input');
	su_pswd_input = document.getElementById('su-pswd-input');
	su_cpswd_input = document.getElementById('su-cpswd-input');

	let username = username_input.value;
    query('auth', 'post', {"name": su_name_input.value, "age": su_age_input.value, "gender": su_gender_input.value, "email": su_email_input.value, "username": su_username_input.value, "password": su_pswd_input.value} , 'application/json', true, function(res){
        if(res[0] === 200){
			auth_page_bts.hide();
			window.sessionStorage.setItem('user', username);
        	console.log("Signed Up!");
        }
        else if(res[0] === 404){
        }
    });
}	


function nav_link_auth_cLicked(element){
	nav_link_auth.forEach((index) => {
		console.log(index.getAttribute('data-href'));
		console.log(element.getAttribute('data-href'));
		if(element.getAttribute('data-href') == index.getAttribute('data-href')){
			console.log("loop");
			index.classList.add("active-sign");
			auth_page[0].style.width = "50%";
			auth_page_body[0].innerHTML = '<div class="d-flex flex-column auth-page-col"><div><h4>Name</h4><div class="input-group mb-3"><input type="text" class="form-control ps-0" id="su-name-input"  aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm"></div></div><div><h4>Age</h4><div class="input-group mb-3"><input type="text" class="form-control ps-0" id="su-age-input" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm"></div></div><div><h4>Gender</h4><div class="input-group mb-3"><input type="text" class="form-control ps-0" id="su-gender-input" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm"></div></div><div><h4>Email</h4><div class="input-group mb-3"><input type="text" class="form-control ps-0" id="su-email-input" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm"></div></div></div><div class="d-flex flex-column auth-page-col"><div><h4>Username</h4><div class="input-group mb-3"><input type="text" class="form-control ps-0" id="su-username-input" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm"></div></div><div><h4>Password</h4><div class="input-group mb-3"><input type="text" class="form-control ps-0" id="su-pswd-input" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm"></div></div><div><h4>Confirm Password</h4><div class="input-group mb-3"><input type="text" class="form-control ps-0" id="su-cpswd-input" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm"></div></div><div class="d-flex flex-column mb-3 gap-2"><button type="button" class="btn btn-primary" name="signup" onclick="signup_btn_clicked()">Sign Up</button><button type="button" class="btn btn-secondary" name="signin"  data-href="signin" onclick="nav_link_auth_cLicked(this)">Back</button></div></div>';
		}
		else{
			console.log("else");
			index.classList.remove("active-sign");
			auth_page[0].style.width = "26%";
			auth_page_body[0].innerHTML = '<div class="d-flex flex-column auth-page-col"><div><h4>Username</h4><div class="input-group mb-3"><input type="text" class="form-control ps-0" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm"></div></div><div><h4>Password</h4><div class="input-group mb-3"><input type="text" class="form-control ps-0" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm"></div></div><div class="d-flex flex-column mb-3 gap-2"><button type="button" class="btn btn-primary">Sign In</button><button type="button" class="btn btn-secondary" name="signup"  data-href="signup" onclick="nav_link_auth_cLicked(this)">Sign Up</button></div></div>';
		}
	});
}


// function to make various Requests to Server
function query(route, method, body, type, parse, response){
    if (method === 'get' && parse === true){
        fetch(route, {
            method: method,
            headers: {
              'Accept': type,
              'Content-Type': type
            }
        }).then(async function(res){
            if (res.status === 200){
                return [res.status, await res.json()];
            }
            else{
                return [res.status, await res.json()];
            }
            return res;
        }).then(function(data){
            if (data[0] === 200){
                console.log(route, " query:" ,data);
                response(data);
            }
            else{
                response(data);
            }
            return data;
        }).catch(function(err) {
            console.log(err);
            alert('Error');
        });
    }
    else if(method !== 'get' && parse === true){
        fetch(route, {
            method: method,
            headers: {
              'Accept': 'application/json',
              'Content-Type': 'application/json'
            },
            body: JSON.stringify(body)
        }).then(async function(res) {
            console.log(res);
            console.log("not okaiiii");
            if (res.status === 200){
                return [res.status, await res.json()];
            }
            else{
                return [res.status, await res.json()];
            }
        }).then(function(data) {
            if (data[0] === 200){
                console.log(route, " query:" ,data);
                response(data);
            }
            else{
                response(data);
            }
        }).catch(function(err) {
            console.log(err);
            alert('Error');
        });
    }
    else if(method !== 'get' && parse === false){
        fetch(route, {
            method: method,
            headers: {
              'Accept': 'application/json',
              'Content-Type': 'application/json'
            },
            body: JSON.stringify(body)
        }).then(async function(res) {
            return res;
        }).then(function(data) {
            response(data);
            return data;
        }).catch(function(err) {
            console.log(err);
            alert('Error');
        });
    }
}