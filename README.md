<h1 align="center">Conversor de monedas</h1>
<div align="center">
  <img src="https://github.com/David12AR/conversorDeMonedas/blob/main/imagenes/pantalla-inicio.JPG?raw=true" width="500">
</div>

<div align="center">
  <a href="https://github.com/David12AR/conversorDeMonedas">
    <img src="https://img.shields.io/github/stars/David12AR/conversorDeMonedas?style=social" alt="GitHub stars">
  </a>
  <a href="https://github.com/David12AR/conversorDeMonedas">
    <img src="https://img.shields.io/github/forks/David12AR/conversorDeMonedas?style=social" alt="GitHub forks">
  </a>
  <a href="https://github.com/David12AR/conversorDeMonedas">
    <img src="https://img.shields.io/github/license/David12AR/conversorDeMonedas" alt="License">
  </a>
  <a href="https://github.com/David12AR/conversorDeMonedas">
    <img src="https://img.shields.io/github/last-commit/David12AR/conversorDeMonedas" alt="Last commit">
  </a>
</div>

---

## 📑 Índice

1. [📌 Acerca del proyecto](#-acerca-del-proyecto)
2. [✨ Funcionalidades](#-funcionalidades)
3. [🚀 ¿Cómo funciona?](#-cómo-funciona)
4. [🛠️ Tecnologías utilizadas](#-tecnologías-utilizadas)
5. [👤 Autor](#-autor)

---

## 📌 Acerca del proyecto

Este proyecto desarrollado en **Java** y conectado a la **ExchangeRate API**, permite convertir entre diversas monedas internacionales mediante un menú interactivo. El usuario puede consultar las tasas de cambio actualizadas en tiempo real y visualizar el historial de conversiones realizadas.

**🏁 Proyecto finalizado, con posibilidades de mejora y contribución. 🔧**

---

## ✨ Funcionalidades

- 🔟 **Menú interactivo** con 10 opciones para convertir entre divisas:  
  💵 Dólar, 💶 Euro, 🇨🇴 Peso colombiano, 🇦🇷 Peso argentino, 🇧🇷 Real brasileño, 🇨🇱 Peso chileno, 🇲🇽 Peso mexicano.

- 📄 **Registro automático** de cada conversión en un archivo `.json`, nombrado según la moneda base (ej. `COP.json`).

- 🚪 **Opción 11 para salir** del programa, con:
  - 📊 Visualización del historial de conversiones realizadas.
  - 📝 Opción para guardar el historial en un archivo `.txt`.

- ⚠️ **Validaciones inteligentes**:
  - ❌ Si se ingresan caracteres no numéricos, el sistema muestra un error y se cierra.
  - 🔢 Si se ingresa un número fuera del menú, el sistema solicita un valor válido y vuelve a mostrar el menú.
  - ℹ️ Si se sale sin realizar ninguna conversión, el sistema lo notifica y termina.

---

## 🚀 ¿Cómo funciona?

1. **Selecciona una opción (1-10)** del menú para elegir la conversión deseada. Por ejemplo, opción 6: convertir de *peso colombiano* a *dólar*. El sistema accede a la API y obtiene las tasas de cambio en tiempo real.

2. **Ingresa el monto a convertir**. Por ejemplo, al ingresar `8374 COP` obtendrás aproximadamente `2.022 USD`.

   <img src="https://github.com/David12AR/conversorDeMonedas/blob/main/imagenes/pantalla-conversion-cop.JPG?raw=true" width="500">

3. El menú volverá a mostrarse para realizar nuevas conversiones. Por ejemplo, opción 8: convertir de *peso mexicano* a *euro*. Ingresando `50 MXN` obtendrás aproximadamente `2.2955 EUR`.

   <img src="https://github.com/David12AR/conversorDeMonedas/blob/main/imagenes/pantalla-conversion-mxn.JPG?raw=true" width="500">

4. Puedes realizar tantas conversiones como desees. Cada conversión se almacena en un archivo `.json`, como `COP.json`.

   <img src="https://github.com/David12AR/conversorDeMonedas/blob/main/imagenes/archivo-json.JPG?raw=true" width="500">

5. Para finalizar, selecciona la opción 11. El sistema mostrará el historial de conversiones realizadas.

   <img src="https://github.com/David12AR/conversorDeMonedas/blob/main/imagenes/salir-historial.JPG?raw=true" width="500">

6. Se te preguntará si deseas guardar el historial en un archivo `.txt`. Si eliges "1", se creará el archivo; si eliges "0", el programa finalizará sin guardar.

   <img src="https://github.com/David12AR/conversorDeMonedas/blob/main/imagenes/imprimir-historial.JPG?raw=true" width="500">

   <img src="https://github.com/David12AR/conversorDeMonedas/blob/main/imagenes/historial-conversiones.JPG?raw=true" width="500">

   <img src="https://github.com/David12AR/conversorDeMonedas/blob/main/imagenes/salir-sin-historial.JPG?raw=true" width="500">

---

## 🛠️ Tecnologías utilizadas

- **Java** → Lógica y ejecución del programa por consola.
- **ExchangeRate API** → Consulta en tiempo real de tasas de cambio y conversión entre divisas.

---

## 👤 Autor

| [<img src="imagenes/david_linkedin.jpg" width=115><br><sub>David Acosta</sub>](https://github.com/David12AR) |
| :---: |

| 💻 [GitHub](https://github.com/David12AR) • 🔗 [LinkedIn](https://linkedin.com/in/david-acosta01) |