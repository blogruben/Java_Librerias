# Enviar email
Usando la libreria JavaEmail

Podemos enviar el email por los protocolos
TLS (Transport Layer Security) o SSL (Secure Socket Layers), 
TLS es una versión más reciente de SSL.

Si usamos un correo gmail para el correo dara el siguiente error
``javax.mail.AuthenticationFailedException: Username and Password not accepted.``
aunque la contrasena sea correcta debido a que el proveedor quiere que uses 
su propia herramienta ``Gmail API`` y no permite entrar con la contrasena de la cuenta.

Si no queremos usar el ``Gmail API`` tenemos otra opcion.
Si activas la verificacion de 2-pasos Google permite generar contrasenas 
para el uso de las aplicaciones.
El doble-factor o dos-pasos significa que para acceder primero poner 
la contrasena como siempre y luego te llegar un SMS al telefono. 
Este doble-factor puede ser un problema para un  cliente de correo ya que
no puede recibir el codigo en el movil. Por ello cuando tenemos doble-factor
podemos generar contrasenas para uso exclusion de los clientes de correo.

Para generar las contrasenas para las aplicaciones seguir esta guia:
https://support.google.com/accounts/answer/185833#app-passwords






