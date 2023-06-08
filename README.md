# Ecommerce con Spring Tool Suite 4.

## Información y navegación del proyecto:

En este proyecto se crea una web para el comercio **Coruña Automoción**.

Esta web contiene un **Home** el cual da a conocer de que va la empresa y los coches destacados junto con los servicios que ésta ofrece.

También consta de un **Header** y **Footer** que sirven para navegar por las distintas vistas de la web, en las cuales se encuentran la **Tienda**,**Contacto**, **Log In**, **Registro** y **Carrito**.

En la página de **Coches** existe un listado de los coches que se encuentran en venta, con las características más importantes junto con 2 botones que tienen como función añadir al carrito de compra o mostrar más detalles, en este caso, el coche. 

Al entrar en la página de **Detalle**, se mostrarán los datos del coche que no eran visibles desde la página de listado de productos. Además podremos ver los comentarios de los distintos usuarios sobre el coche en venta debajo del boton de compra.

La página de **Contacto** nos lleva a un formulario en el que los usuarios que tengan alguna cuestión se la podrán transmitir a los administradores para asi recibir una respuesta.

Las paginas de **Log In** y **Registro** contienen un formulario, cada uno cumple la función de crear un usuario e iniciar sesión.

Por último, tenemos la vista del **Carrito** que muestra los coches que se han añadido a éste.

## Autores

Este ecommerce está creado por un único desarrollador, David Corral Allo. El enlace a su github es "https://github.com/davidcorralallo".

## Conexión e información de la BBDD.

En la base de datos existen múltiples tablas que dan funcionalidad a la página, estas son las siguientes:
*Perfiles*,
*UsuarioPerfil*,
*Clientes*,
*Ventas*,
*Productos*,
*Coches*,
*CochesConcesionario*,
*Concesionarios*,
*Empleados*.

Todas estas tablas son necesarias para la funcionalidad completa del proyecto.

Esta base de datos se conecta a Spring Tool mediante esta linea en la clase de application.properties:
*spring.datasource.url=jdbc:mysql://localhost:3306/concesionario?useSSL=false&serverTimezone=Europe/Madrid&allowPublicKeyRetrieval=true*


## Instalación:

A continuación se explicará como instalar el proyecto del Ecommerce en cualquier ordenador.

### Descarga

Para comenzar debemos descargar un archivo zip de este repositorio.

### Descargas necesarias:

Lo segundo seria asegurarse de tener descargado Java Development Kit (JDK) en tu sistema. En caso de no tenerlo se puede descargar en el sitio web oficial de Oracle “https://www.oracle.com/es/java/technologies/downloads/”.

Una vez confirmado que tenemos JDK en el sistema, se procederá a descargar Spring Tool Suite (STS) , que es un entorno de desarrollo integrado para proyectos basados en Spring. Puedes encontrar la descarga en el sitio web de Spring Tool Suite “https://spring.io/tools”. 

Como última descarga necesaria tenemos MySQL, en caso de no tenerlo se podrá descargar en el sitio oficial de MySQL “https://dev.mysql.com/downloads/installer/”.

### Importar:

Una vez tenemos todos los programas necesarios instalados procederemos a importar el proyecto en sus respectivos programas.

**BBDD**
Para empezar abriremos MySQL Panel e importaremos la base de datos concesionario.sql que descargamos en el respositorio.

**SPRING TOOL**
Ahora se debe de importar el proyecto en Spring Tool Suite (TFC), esto se puede hacer abriendo el programa y seleccionando "File" (Archivo) > "Import" (Importar) en el menú superior.  

1.	En la ventana de importación, elige "Existing Maven Projects" (Proyectos Maven existentes) y haz clic en "Next" (Siguiente).
2.	Navega hasta la ubicación donde descargaste el proyecto desde GitHub y selecciona la carpeta raíz del proyecto.
3.	Asegúrate de que el proyecto esté seleccionado en la lista y haz clic en "Finish" (Finalizar) para importarlo.

**Conexion SPRING TOOL a BBDD**
Una vez importado el proyecto se continuará configurando la conexión de 
la base de datos MySQL. Para esto nos dirigiremos a la dirección siguiente dentro del proyecto TFC\src\main\resources\application.properties y se deberán ajustar los siguientes campos:

spring.datasource.url= Aquí se pegará la dirección actual de la base de datos.
spring.datasource.username= Aquí se escribirá el nombre de usuario.
Spring.datasource.password= Aquí se escribirá la contraseña para ese usuario.

## Iniciar proyecto:

Es hora de Ejecuta el proyecto:

•	Haz clic derecho en el proyecto importado en Spring Tool Suite y selecciona "Run As" (Ejecutar como) > "Spring Boot App" (Aplicación Spring Boot).

•	Spring Tool Suite compilará y ejecutará tu proyecto de e-commerce. Podrás ver la información de registro y la URL de acceso en la consola de la aplica-ción

¡Listo! Se ha completado la instalación, ahora inicia el proyecto y la base de datos MySQL y entra en la url proporcionada en la consola de Spring Tool Suite.


## Licencia del proyecto:

**MIT License**

Copyright (c) 2023 David Corral Allo

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
