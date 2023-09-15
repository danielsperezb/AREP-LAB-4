// script.js

// Función para iniciar la animación de rotación continua
function iniciarRotacionContinua() {
    const elementoTexto = document.querySelector('h1');
    
    // Agrega una clase CSS que define la animación
    elementoTexto.classList.add('rotar-continuamente');
}

// Llama a la función cuando se carga la página
window.addEventListener('load', iniciarRotacionContinua);
