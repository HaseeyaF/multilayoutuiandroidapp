# MultiLayout UI Android App
A simple Android app that demonstrates multiple layouts with a Bottom Navigation Bar and SQLite database integration. Developed as part of an Android development practical assignment.

## ✨ Features

- **Linear Layout (Home Page)**  
  Vertical layout with text fields for user input and labels like *Enter Name*, *Enter Age*.  
  Includes a background image.

- **Frame Layout (Profile Page)**  
  Profile screen with ImageView, TextView (Welcome message), and Edit Profile button.

- **Constraint Layout + Nested Linear Layout (Student Form)**  
  Student form with input fields (Name, Email, Phone), small icons, Submit & Clear buttons.  
  Proper alignment using constraints.

- **Relative Layout (Dashboard)**  
  Dashboard with TextViews, buttons (View Profile, Settings), EditText for search, and background image.

- **Bottom Navigation Bar**  
  Navigate between Home, Profile, Form, and Dashboard.

- **SQLite Database**  
  Stores student form data with CRUD (Create, Read, Update, Delete) operations.

## 🗄 Database Structure

Table: `students`

| Column | Type | Description |
|---------|------|-------------|
| ID | INTEGER PRIMARY KEY AUTOINCREMENT | Unique identifier |
| Name | TEXT | Student name |
| Email | TEXT | Student email |
| Phone | TEXT | Student phone number |

## 📂 Project Structure

```
app/
├── java/your/package/
│    ├── MainActivity.java         # Linear Layout (Home)
│    ├── ProfileActivity.java      # Frame Layout
│    ├── FormActivity.java         # Constraint + Linear
│    ├── DashboardActivity.java    # Relative Layout
│    ├── DBHelper.java             # SQLite database helper
├── res/
│    ├── layout/                   # XML layout files
│    ├── drawable/                 # Images and icons
│    ├── values/                   # Strings, colors, styles
│    ├── mipmap/                   # App launcher icons

````

## 🚀 How to Run
1️⃣ Clone this repository  
```bash
git clone https://github.com/your-username/multilayoutuiandroidapp.git
````
2️⃣ Open the project in **Android Studio**.

3️⃣ Build and run on an emulator or physical device.



