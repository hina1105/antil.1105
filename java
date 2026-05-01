// Welcome alert when page loads
window.onload = function () {
    alert("Welcome to Hina Antil's Portfolio Website!");
};

// Smooth scroll effect
document.querySelectorAll('a[href^="#"]').forEach(anchor => {
    anchor.addEventListener('click', function (e) {
        e.preventDefault();
        document.querySelector(this.getAttribute('href')).scrollIntoView({
            behavior: 'smooth'
        });
    });
});

// Image click zoom effect
const images = document.querySelectorAll("img");

images.forEach(img => {
    img.addEventListener("click", () => {
        if (img.style.transform === "scale(1.5)") {
            img.style.transform = "scale(1)";
        } else {
            img.style.transform = "scale(1.5)";
        }
    });
});

// Dynamic greeting based on time
const greeting = document.createElement("h3");
let hour = new Date().getHours();

if (hour < 12) {
    greeting.innerText = "Good Morning!";
} else if (hour < 18) {
    greeting.innerText = "Good Afternoon!";
} else {
    greeting.innerText = "Good Evening!";
}

greeting.style.textAlign = "center";
greeting.style.marginTop = "15px";

document.querySelector(".container").prepend(greeting);

// Button to show/hide contact info
const btn = document.createElement("button");
btn.innerText = "Show Contact Info";
btn.style.padding = "10px";
btn.style.marginTop = "10px";
btn.style.cursor = "pointer";

const contact = document.querySelector("h2:last-of-type").nextElementSibling;
contact.style.display = "none";

btn.onclick = () => {
    if (contact.style.display === "none") {
        contact.style.display = "block";
        btn.innerText = "Hide Contact Info";
    } else {
        contact.style.display = "none";
        btn.innerText = "Show Contact Info";
    }
};

document.querySelector(".container").appendChild(btn);
