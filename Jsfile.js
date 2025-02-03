let searchBtn = document.querySelector("#search-btn");
let searchBar = document.querySelector(".search-bar-container");
let formBtn   = document.querySelector("#login-btn");
let loginform= document.querySelector(".login-form");
let formclose = document.querySelector("#form-close");
let menu = document.querySelector("#menu-bar");
let navbar = document.querySelector(".navbar");
let videoBtn = document.querySelectorAll(".vid-btn");



window.onscroll = () =>{
    searchBtn.classList.remove('fa-times');
    searchBar.classList.remove('active');
    menu.classList.remove('fa-times');
    navbar.classList.remove('active');
    loginform.classList.remove('active');
}
menu.addEventListener('click',() =>{
    menu.classList.toggle("fa-times");
    navbar.classList.toggle('active');
})
searchBtn.addEventListener('click',() =>{
    searchBtn.classList.toggle('fa-times');
    searchBar.classList.toggle('active');
});
formBtn.addEventListener('click',() =>{
    loginform.classList.add('active');

});
formclose.addEventListener('click',() =>{
    loginform.classList.remove('active');
});
videoBtn.forEach(btn =>{
    btn.addEventListener('click', ()=>{
        document.querySelector('.controls .active').classList.remove('active');
        btn.classList.add('active');
        let src = btn.getAttribute('data-src');
        document.querySelector('#video-slider').src = src;
    });
});
var swiper = new Swiper(".review-slider", {
    spaceBetween: 20,
    loop:true,
    autoplay:{
        delay:2500,
        disableOnInteraction:false,
    },
    breakpoints: {
        640: {
            slidesPerView:1,
        },
        768: {
            slidesPerView:2,

        },
        1024: {
            slidesPerView:3,
        },
    },

});
var swiper = new Swiper(".brand-slider", {
    spaceBetween: 20,
    loop:true,
    autoplay:{
        delay:2500,
        disableOnInteraction:false,
    },
    breakpoints: {
        450:{
            slidesPerView: 2,
        },
        768: {
            slidesPerView:3,
        },
        991: {
            slidesPerView:4,

        },
        1200: {
            slidesPerView:5,
        },
    }
});

function validateEmail(email) {
    const re = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return re.test(email);
}

function validatePassword(password) {
    const re = /^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/;
    return re.test(password);
}

function runTests() {
    const emailTests = [
        { input: "test@example.com", expected: true },
        { input: "invalid-email", expected: false },
        { input: "test@.com", expected: false },
        { input: "test@domain", expected: false }
    ];

    const passwordTests = [
        { input: "Password1!", expected: true },
        { input: "password", expected: false },
        { input: "PASSWORD1", expected: false },
        { input: "Pass1", expected: false }
    ];

    emailTests.forEach(test => {
        const result = validateEmail(test.input);
        console.assert(result === test.expected, `Email Test Failed: ${test.input}`);
    });

    passwordTests.forEach(test => {
        const result = validatePassword(test.input);
        console.assert(result === test.expected, `Password Test Failed: ${test.input}`);
    });

    alert("Tests completed. Check console for results.");
}