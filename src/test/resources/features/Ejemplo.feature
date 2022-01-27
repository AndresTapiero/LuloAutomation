# language: es

Característica: Validar inputs vacios
  Como usuario
  Quiero validar los inputs vacios
  Para ver el mensaje Agrega datos

  Escenario: Presionar el boton calcular con los inputs vacios
    Dado Que estoy en la pantalla principal con los inputs vacios
    Cuando presion el botón calcular
    Entonces vere el texto ingrese datos

  Esquema del escenario: No agregar datos en los inputs
    Dado Que estoy en la pantalla principal con los inputs vacios
    Cuando presionel botón calcular
      | <username> | <password> |
    Entonces vere el texto ingrese datos

    Ejemplos:
      | username | password |
      | andres   | andres1  |