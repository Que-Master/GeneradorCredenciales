# 🎫 Generador de Credenciales de Evento
### Estudiante(s):  
- Adrian Ramirez – Patrones de Diseño (Sección 1)
- Anibal Tapia – Patrones de Diseño (Sección 1)

---
## 📋 Descripción del sistema

Este sistema permite generar credenciales personalizadas para asistentes a un evento, a partir de una plantilla base editable. Cada credencial contiene los siguientes datos:

- Nombre del asistente
- Cargo
- RUT

El sistema ofrece una interfaz por consola que permite:

- Crear nuevas credenciales clonando una plantilla existente.
- Visualizar todas las credenciales creadas.
- Gestionar de manera centralizada todas las credenciales mediante una única instancia global.

Este proyecto fue desarrollado en *Java* aplicando los patrones de diseño *Prototype* y *Singleton* para demostrar el uso adecuado de la reutilización de objetos y la gestión controlada de una única instancia compartida.

---

## 🧠 Patrones de diseño aplicados

### 🧬 Prototype

*¿Qué es?*  
El patrón *Prototype* permite crear nuevos objetos clonando una instancia existente en lugar de construirlos desde cero.

*¿Cómo se usó?*  
La clase Credencial implementa el patrón Prototype al sobrescribir el método clone(), permitiendo copiar una credencial base y personalizarla con distintos datos (nombre, cargo y RUT). Esto permite reutilizar una plantilla base y crear nuevas instancias sin construirlas manualmente.

```java
Credencial plantilla = new Credencial("Nombre", "Cargo", "RUT");
Credencial nueva = plantilla.clone();
nueva.setNombre("Ana Gómez");
nueva.setCargo("Diseñadora");
nueva.setRut("12.345.678-9");
```

---
###🔒 Patrón Singleton – Aplicación

- `GestorCredenciales` implementa el patrón Singleton:
  - Contiene una instancia privada y una lista de credenciales.
- Se accede con `getInstancia()`:

```java
GestorCredenciales gestor = GestorCredenciales.getInstancia();
gestor.agregarCredencial(credencial);
```

---
## 📊 Diagrama de Clases (UML)


---

## 📸 Captura del sistema funcionando

