# ProjectoIntegrador
#### Contenido:
* Descripción del proyecto: Breve introducción sobre el objetivo de la aplicación.
* Características: Lista de las principales funcionalidades de la aplicación.
* Tecnologías utilizadas: Backend (Spring Boot/Java), Frontend (Angular/React), Base de datos (MySQL/MongoDB).
* Prerrequisitos: Herramientas y software necesarios para ejecutar el proyecto.
* Guía de instalación: Pasos para clonar el proyecto, instalar dependencias y ejecutar la aplicación.

### Descripcion del proyecto 
>Esta aplicación web permite a los usuarios buscar, seleccionar y comprar pizarras en línea,
además de ofrecer una gestión interna de inventarios y pedidos. La aplicación está desarrollada
utilizando Spring Boot con Java para el backend y html para el frontend.

### Caracteristicas: 
#### Características Generales
* **Interfaz de Usuario Intuitiva:** Diseño fácil de usar, con navegación fluida y acceso rápido a las funcionalidades principales.
* **Responsividad:** Adaptación automática a diferentes tamaños de pantalla (dispositivos móviles, tablets, computadoras).
* **Seguridad:** Autenticación mediante JWT para usuarios y empleados, cifrado de contraseñas y validación de entradas para prevenir vulnerabilidades.

#### Características para Clientes (Usuarios Finales)
1. _Catálogo de Productos:_

* Vista de los productos disponibles con imágenes, precios y descripciones.
* Filtros de búsqueda por tipo de pizarra (tamaño, material, precio, etc.).
* Paginación para facilitar la navegación en catálogos grandes.
  
2. _Carrito de Compras:_

* Capacidad para añadir productos al carrito desde la página de productos.
* Visualización del carrito con los productos seleccionados, precios individuales y totales.
* Posibilidad de actualizar cantidades o eliminar productos del carrito.

3. _Sistema de Pago:_

* Integración con pasarelas de pago (PayPal, Stripe, etc.).
* Opciones de pago con tarjetas de crédito/débito o transferencia bancaria.
* Confirmación de compra con detalles del pedido y notificación por correo electrónico.

4. _Historial de Compras:_

* Listado de pedidos anteriores con fechas, productos adquiridos y estado de entrega.
* Posibilidad de volver a comprar productos previos con un clic.
* Reseñas y Valoraciones de Productos:
  * Sistema para que los clientes valoren los productos y dejen comentarios.
  * Calificaciones con estrellas y reseñas para ayudar a otros usuarios a decidirse por productos.
  * Soporte al Cliente en Línea:

5. _Gestión de Pedidos:_

* Vista de los pedidos realizados por los clientes con detalles completos (productos, cantidades, datos de envío).
* Actualización del estado del pedido (procesando, enviado, entregado, etc.).
* Opción para cancelar o modificar pedidos bajo ciertas condiciones.

6. _Generación de Informes:_

* Creación de informes de ventas por producto, por periodo de tiempo, por cliente, etc.
* Visualización de estadísticas de ventas en tiempo real o por rangos específicos.

#### Características para Administradores

1. _Gestión de Usuarios:_

* Creación, modificación y eliminación de cuentas de clientes y empleados.
* Asignación de roles (cliente, empleado, administrador) con diferentes niveles de permisos.
* Gestión de permisos y acceso a ciertas funcionalidades del sistema.

2. _Gestión de Productos:_

* Capacidad para añadir, editar o eliminar productos del catálogo.
* Asignación de categorías, precios, descripciones y atributos a cada producto.
* Gestión de imágenes y galerías de productos.
  
3. _Descuentos y Promociones:_

* Creación de códigos promocionales o descuentos por tiempo limitado.
* Gestión de ofertas especiales o descuentos por cantidad de compra.

4. _Panel de Control y Estadísticas:_

* Tablero con estadísticas clave (número de ventas, productos más vendidos, ingresos diarios/semanales/mensuales).
* Visualización gráfica de las métricas de rendimiento del negocio.

5. Gestión de Comentarios y Reseñas:

* Capacidad para moderar o eliminar comentarios inapropiados o que no cumplan las políticas de la tienda.
* Respuesta a las reseñas de los usuarios para mejorar la relación con los clientes.

### Características Adicionales

1. Sistema de Notificaciones:

* Notificaciones por correo electrónico o SMS para actualizaciones de pedidos, ofertas especiales o novedades de productos.
* Recordatorios de productos abandonados en el carrito de compras.



Tecnologías para Implementar las Características
Backend: Spring Boot (Java), manejando la lógica de negocio, autenticación y gestión de API.
Frontend: Angular o React para una interfaz moderna, con diseño responsivo.
Base de Datos: MySQL o MongoDB para almacenamiento de datos.
Pasarelas de Pago: Integración con API de PayPal o Stripe.
API de Notificaciones: Twilio (para SMS) o SendGrid (para correos electrónicos).
