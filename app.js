(function () {
  const optionsContainer = document.getElementById("options");
  const bestBtn = document.getElementById("bestBtn");

  // Render inicial de las 3 opciones desde la configuración
  function renderOptions(opciones) {
    optionsContainer.innerHTML = "";
    opciones.forEach((opt) => {
      const card = document.createElement("article");
      card.className = "card";
      card.dataset.id = opt.id;

      card.innerHTML = `
        <h2>${opt.titulo}</h2>
        <p>${opt.texto}</p>
        ${opt.esMejor ? `<span class="badge badge--best">Mejor opción (administrador)</span>` : `<span class="badge">Opción</span>`}
      `;
      optionsContainer.appendChild(card);
    });
  }

  // Filtra y deja solo la mejor opción definida por el administrador
  function showBestOnly() {
    const opciones = window.APP_CONFIG?.opciones ?? [];
    const mejor = opciones.find((o) => o.esMejor === true);

    if (!mejor) {
      alert("No hay una opción marcada como mejor por el administrador.");
      return;
    }

    renderOptions([mejor]);
  }

  // Inicializar
  const initialOptions = window.APP_CONFIG?.opciones ?? [];
  renderOptions(initialOptions);

  // Evento del botón
  bestBtn.addEventListener("click", showBestOnly);
})();