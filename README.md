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
### 🔒 Patrón Singleton – Aplicación

- `GestorCredenciales` implementa el patrón Singleton:
  - Contiene una instancia privada y una lista de credenciales.
- Se accede con `getInstancia()`:

```java
GestorCredenciales gestor = GestorCredenciales.getInstancia();
gestor.agregarCredencial(credencial);
```

---
## 📊 Diagrama de Clases (UML)

![Image](https://github.com/user-attachments/assets/163cf37f-3926-4012-8444-a9b840e021b1)
---

## 📸 Captura del sistema funcionando
![Image](https://github.com/user-attachments/assets/40c5b4a8-8e22-4d33-a2dc-d98a2bbfaf06)
![Image](https://github.com/user-attachments/assets/6497486a-3562-4481-a869-db802d2def40)
![Image](https://github.com/user-attachments/assets/130ef0c6-a907-465d-a04e-2829bbca34c3)

