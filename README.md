# JAVA_PROJECT
# Blood Bank Management System

This is a web application for managing blood donations and requests at a blood bank. It allows donors to sign up and donate blood, and allows hospitals to request and receive blood donations.

## Features

- Donors can sign up and donate blood
- Hospitals can request and receive blood donations
- Administrators can manage users and donations
- Search for donors based on blood type, location, and availability
- Email notifications for new donations and requests
- Dashboard for tracking donations and requests

## Getting Started

### Prerequisites

- Node.js 14.x or higher
- PostgreSQL 12.x or higher

### Installing

1. Clone the repository: `git clone https://github.com/AMITESH30/BLOOD-BANK-MANAGEMENT-SYSTEM.git`
2. Install dependencies: `npm install`
3. Create a `.env` file in the root directory with the following environment variables:
   - `DATABASE_URL`: URL for connecting to the PostgreSQL database
   - `JWT_SECRET`: Secret for encrypting and verifying JSON Web Tokens
   - `SENDGRID_API_KEY`: API key for sending email notifications with SendGrid
4. Run database migrations: `npm run db:migrate`
5. Seed the database with initial data: `npm run db:seed`
6. Start the server: `npm start`

### Running Tests

1. Create a test database: `createdb blood_bank_test`
2. Run database migrations on the test database: `npm run db:migrate-test`
3. Run tests: `npm test`

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).
