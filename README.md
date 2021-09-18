###Repositorio Inventario de Vacunación de Empleados****

**Introducción**
Aplicativo que permite, llevar el control de todo el persona de la empresa que esta y no esta vacuna, para  prevención de COVID-19. Actualmente se encuentra  en proceso de implentación total de todas las funciones requeridas.

**Instalación:**
- Netbeans 12.0
- JDK 8
- Glassfish Server 5.0
- JDBC 8.25
- Base de Datos Mysql

**Conexión Base de datos**
Configuración en servidor Glassfish, ir a:
- JDBC 
	 JDBC Connection Pools
	**new**
	- Pool name: vacunacionPool
	- Resource Type: javax.sql.ConnectionPoolDataSource
	- Database Driver Vendor: Mysql
	- Hacer clic: Next
	**Add Property**
	- password: admin321
	- databaseName: vacunacion
	- serverName: localhost
	- dataSourceName: com.mysql.cj.jdbc.MysqlDataSource
	- user: root
	- portNumber: 3306
	- useSSL: false
	- useTimezone: true
	- serverTimezone: UTC
	- allowPublicKeyRetrieval: true
	- Hacer clic: Save
- **JDBC Resources** 
JDBC Connection Pools
	**new**
	- JNDI Name: jdbc/vacunacionDb
	- Pool Name: vacunacionPool
	- Save

*JDBC Connection Pools -> ping -> Ping Succeeded * para continuar.

**Creación proyecto IDE Netbeans**
- New Proyect ->Java with Maven -> Web Application -> nombreProyecto **Vacunacion** -> next -> Java EE y Glassfish 5.0  -> finish.
- Abrir proyecto Vacunacion, ir a:
	- Agregar en archivo** pom** las siguientes Librerías:
		- Java Persistencia API
		- org.eclipse.persistence
		- Mysql Conector
		- org. primefaces 
		
	- Other Sources -> src/main/sources -> META -> persistence.xml agregar siguiente código, dentro del archivo. 

<persistence-unit name="inventarioPU" transaction-type="JTA">
        
    <jta-data-source>jdbc/vacunacionDb</jta-data-source>
    </persistence-unit>
clic derecho sobre el proyecyo y Clean and Build.

**Generación de Clases**

**Paquete que manipula los datos**:
oquinteros.entidad:  Clases relacionadas con la Base de datos con JPA.
- Clase Empleado
- Clase Users

oquinteros.dato: Manipulación de Datos
- Interfaces EmpleadoDao
- Clase EmpleadoDaoImpl
- Interfaces LoginDao
- Clase LoginDaoImpl

oquinteros.service: Buena práctica para manipulación de datos.
- EmpleadoService
- EmpleadoServiceImpl
- LoginService
- LoginServiceImpl

oquinteros.web: Accede al paquete oquinteros.service,  directo a los datos.
- EmpleadoBean
- LoginBean
- configuracionBean: Configuración para que reconozca JSFACES. 

**Diseño**
Ventana de Login
permite ingresar de acuerdo al rol en la empresa:

Administrador: ventana principal
usuario: admin
password: admin321

empleado: ventana de visualización
usuario: jsistemas
password: sys321

VentanaPrincipal: acceso administrativo
permite al administrador:
- Agregar: ventana modal para agregar: cédula Identidad, nombres, apellidos, email,  fecha nacimiento, dirección, teléfono. Cada campo con validaciones indicadas.
- Editar:  en la ventana principal, presionando el símbolo de la parte de opciones.
- Actualizar: presionando el símbolo de la parte de opciones o a su vez enter.
- Eliminar: con clic derecho en cualquier parte del registro.
- Botón que permite salir del sistema.

Ventana de Visuzalición
permite al empleado:
- Por el momento visualizar sus datos, objetivo que pueda actualizar los datos indicados.
- Botón que permite salir del sistema.

**NOTA**
Estimado/a.
> Lo imposible solo tarda un poquito más - **Ernesto Kruger**.

El proyecto no contiene el total de requisitos y funcionalidades queridas, adicional a los errores de código que se presentan en cada aplicativo a desarrollar,  lo que hizo  adoptar otras tecnologías sobre las requeridas,  para mi es lamentable y a la vez me motiva a seguir  esforzándome. Gracias por su tiempo, saludos.


###End
