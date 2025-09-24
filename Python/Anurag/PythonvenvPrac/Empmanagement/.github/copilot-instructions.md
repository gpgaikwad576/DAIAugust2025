# Copilot Instructions for Empmanagement Django Project

## Project Overview
This is a Django-based Employee Management System. The main app is `Empmanagement`, and it uses SQLite (`db.sqlite3`) for data storage. The UI is rendered using HTML templates in `Empmanagement/templates/`.

## Architecture & Key Files
- `Empmanagement/`: Django app containing settings, URLs, views, and WSGI/ASGI entrypoints.
  - `settings.py`: Django configuration (DB, installed apps, etc.)
  - `urls.py`: URL routing for CRUD operations
  - `views.py`: Handles business logic for Create, Read, Update, Delete
  - `templates/`: Contains HTML files for each CRUD operation
    - `Main.html`: Home page with navigation to CRUD actions
    - `Create.html`, `Read.html`, `Update.html`, `Delete.html`: UI for respective actions
- `manage.py`: Django CLI entrypoint
- `db.sqlite3`: SQLite database file

## Developer Workflows
- **Run server:**
  ```powershell
  python manage.py runserver
  ```
- **Apply migrations:**
  ```powershell
  python manage.py makemigrations
  python manage.py migrate
  ```
- **Create superuser (for admin):**
  ```powershell
  python manage.py createsuperuser
  ```
- **Access admin panel:**
  Visit `/admin` in browser after starting server

## Patterns & Conventions
- **CRUD Routing:**
  - `/create/`, `/read/`, `/update/`, `/delete/` mapped to respective views and templates
  - Navigation is handled via links in `Main.html`
- **Templates:**
  - All HTML templates are in `Empmanagement/templates/`
  - Use Django template syntax for dynamic content
- **Views:**
  - All business logic for CRUD is in `views.py`
  - Each CRUD operation has a dedicated view and template
- **No REST API:**
  - All interactions are via server-rendered HTML, not JSON endpoints

## Integration Points
- No external APIs or services are integrated
- All data is stored locally in SQLite

## Example: Adding a New CRUD Operation
1. Add a new view in `views.py`
2. Add a URL pattern in `urls.py`
3. Create a new template in `templates/`
4. Add a navigation link in `Main.html`

## Quick Reference
- Main app: `Empmanagement/`
- Templates: `Empmanagement/templates/`
- Entry point: `manage.py`
- Database: `db.sqlite3`

---

**Feedback requested:** If any section is unclear or missing, please specify what needs improvement or additional detail.