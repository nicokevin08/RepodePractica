  let txtNombre = document.getElementById("txtNombre"); //Cargamos el valor del campo ("txtNombre") en la variable -> let txtNombre
  let txtTelefono = document.getElementById("txtTelefono"); //Cargamos el valor del campo ("txtTelefono") en la variable -> let txtTelefono
  let txtCorreo = document.getElementById("txtCorreo"); //Cargamos el valor del campo ("txtCorreo") en la variable -> let txtCorreo
  let txtConsulta = document.getElementById("txtConsulta"); //Cargamos el valor del campo ("txtCorreo") en la variable -> let txtConsulta
  let ltaErrores = document.getElementById("ltaErrores");
  let ltaMensajes = document.getElementById("ltaMensajes");

  function validar() {
    ltaErrores.innerHTML = ""; //Limpiamos la lista de errores
    txtNombre.classList.remove("error"); //Removemos de txtNombre la classe existente -> classList.error (le sacamos el color rojo del anterir uso)
    txtTelefono.classList.remove("error"); //Removemos de txtTelefono la classe existente -> classList.error (le sacamos el color rojo del anterir uso)
    txtCorreo.classList.remove("error"); //Removemos de txtCorreo la classe existente -> classList.error (le sacamos el color rojo del anterir uso)
    txtConsulta.classList.remove("error"); //Removemos de txtConsulta la classe existente -> classList.error (le sacamos el color rojo del anterir uso)
    let errores = []; //Crea el array -> errores vacio
    let regex_tel = /^[1-9]\d{9}$/; //Validacion de numero de telefono hasta 9
    let primerCaracter = txtTelefono.value.charAt(0);
    let regex_cor = /^\w+([.-_+]?\w+)*@\w+([.-]?\w+)*(\.\w{2,10})+$/;
    let rpta = "Gracias por contactarnos, a la brevedad nos comunicaremos cabañas Vulpi."
    // Obtener el valor del input y eliminar los espacios en blanco al inicio y al final
    let nbre = txtNombre.value.trim();
    let crreo = txtCorreo.value.trim();
    let cta = txtConsulta.value;
    if (nbre.length == 0) {
      errores.push("Ingrese el nombre"); //Agrega al final del array "errores" el elemento --> "Falta el nombre"
      txtNombre.classList.add("error"); //Cargamos la classList "error" para pintar el campo de rojo (con la class .error )
    } else if (nbre.length > 50) {
      //Ponemos 50 caracteres
      errores.push("Nombre muy largo (50 caracteres)"); //Agrega al final del array "errores" el elemento --> "Nombre muy largo (9 caracteres)"
      txtNombre.classList.add("error"); //Cargamos la classList "error" para pintar el campo de rojo (con la class .error )
    }
    if (txtTelefono.value.length == 0 && crreo.length == 0) {
      errores.push("Ingrese el numero de telefono o correo electronico"); //Agrega al final del array "errores" el elemento --> "Falta el telefono"
      txtTelefono.classList.add("error"); //Cargamos la classList "error" para pintar el campo de rojo (con la class .error )
      txtCorreo.classList.add("error"); //Cargamos la classList "error" para pintar el campo de rojo (con la class .error )
    }
    if (txtTelefono.value.length > 10) {
      //Comprobamos si es mayor a 10digitos
      errores.push("Teléfono muy largo (10 dígitos)"); //Agrega al final del array "errores" el elemento -->  "Teléfono muy largo (10 dígitos)"
      txtTelefono.classList.add("error"); //Cargamos la classList "error" para pintar el campo de rojo (con la class .error )
    }
    if (txtTelefono.value.length > 0 && !regex_tel.test(txtTelefono.value)) {
      //Verificamos que no comience con 0
      if (primerCaracter == "0"){
        errores.push("Teléfono inválido (No puede empezar con cero)"); //Agrega al final del array "errores" el elemento --> "Teléfono inválido..."
      txtTelefono.classList.add("error"); //Cargamos la classList "error" para pintar el campo de rojo (con la class .error )
      } else{
        errores.push("Teléfono inválido (menor a 10 digitos)"); //Agrega al final del array "errores" el elemento --> "Teléfono inválido..."
      txtTelefono.classList.add("error"); //Cargamos la classList "error" para pintar el campo de rojo (con la class .error )
      }
     
    }
    if (!regex_cor.test(txtCorreo.value)) {
      if (!txtCorreo.value.length == 0){
        errores.push("El formato de correo electronico no es valido, formato aceptado: usuario@dominio.com"); //Agrega al final del array "errores" el elemento --> "Correo invalido"
      txtCorreo.classList.add("error"); //Cargamos la classList "error" para pintar el campo de rojo (con la class .error )
      }

    }

    for (let err of errores) {
      //Recorremo la lista cargada con los errores
      let li = document.createElement("li"); // crea la variable li que es tipo -> document.createElement("li")
      //crear un nuevo elemento HTML especificado por el nombre de la etiqueta que se
      //pasa como argumento. En este caso, `"li"` es el nombre de la etiqueta que indica
      //que se está creando un nuevo elemento de lista (`<li>`).
      li.innerHTML = err; //Imprime el error --> err
      ltaErrores.appendChild(li); // Añade el nuevo <li> al final de la lista <ul> ver-> appendChil.html
    }
    if (errores.length == 0) {
      //Verifica que la lista de errores este en 0 y ejecuta
      let li = document.createElement("li"); // crea la variable li que es tipo -> document.createElement("li")
                                            //crear un nuevo elemento HTML especificado por el nombre de la etiqueta que se
                                            //pasa como argumento. En este caso, `"li"` es el nombre de la etiqueta que indica
                                            //que se está creando un nuevo elemento de lista (`<li>`).
   
      if (txtTelefono.value.length == 0) {
        //Si el telefono esta vacio imprime el siguiente cartel
        li.innerHTML = `Hola ${nbre}, te escribiremos al correo: ${txtCorreo.value} <p>
        Su consulta: ${cta} <p>
        ${rpta}`; //Imprimimos la consulta
        //Si el correo esta vacio imprime el siguiente cartel
      } else if (txtCorreo.value.length == 0) {   //Si no imprime este cartel
        li.innerHTML = `Hola ${nbre}, nos comunicaremos al telefono: ${txtTelefono.value} <p>
        Su consulta: ${cta} <p>
        ${rpta}` ;//Imprimimos la consulta
      } else {
        li.innerHTML = `Hola ${nbre}, nos contactaremos al telefono: ${txtTelefono.value} o mail: ${txtCorreo.value} <p>
         Su consulta: ${cta} <p>
          ${rpta}` ;//Imprimimos la consulta
      }
      
      ltaMensajes.appendChild(li); // Añade el nuevo <li> al final de la lista <ul> ver-> appendChil.html
      document.forms[0].reset();

      return false; //return true; //false para no enviar el form
    } else {
      return false; //si hubo errores cancelar el envío
    }
  }