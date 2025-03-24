# 🚀 Spring AI + Gemini Integration Project  

This project demonstrates the integration of **Spring AI** with **Google's Gemini AI model**, providing a foundation for building AI-powered applications using the Spring framework.  

## 🌟 Features  

✅ **Google Gemini AI Integration** – Leverage Gemini for advanced AI responses  
✅ **Dynamic Prompt Templates** – Flexible AI interactions  
✅ **Structured Data Handling** – Java Records & BeanOutputConverter  
✅ **JUnit Testing** – Ensure AI functionality reliability   

## 🛠️ Prerequisites  

🔹 **Java 17+** – Ensure JDK 17 or higher is installed  
🔹 **Maven 3.6+** – Required for building and running the project  
🔹 **Spring Boot 3.2+** – Compatible with the latest Spring Boot versions  

## 🚀 Getting Started  

1️⃣ **Clone the Repository**  
```
git clone https://github.com/majd-alhafi/spring-ai.git
cd spring-ai
```

2️⃣ Configure API Keys

Add your AI model API keys to the application.yml file or set them as environment variables.

3️⃣ Build and Run the Application

```
./mvnw spring-boot:run
```

🔥 API Endpoints

1️⃣ Get Capital by Country

📌 Request:

```
curl --request POST \
  --url http://localhost:8080/getCapital \
  --header 'Content-Type: application/json' \
  --data '{
    "question": "Syria"
  }'
```

📌 Response:

```
{
  "capital": "Damascus",
  "population": "1.83 million",
  "Area": "105 km²"
}
```

2️⃣ General Question Answering

📌 Request:

```
curl --request POST \
  --url http://localhost:8080/ask \
  --header 'Content-Type: application/json' \
  --data '{
    "question": "What is the capital of Saudi Arabia"
  }'
```
📌 Response:

```
{
  "answer": "Riyadh"
}
```


💡 Built with Spring AI for intelligent and structured AI responses! 🚀


