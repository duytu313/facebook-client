import express from "express";
import cors from "cors";
import bodyParser from "body-parser";
import axios from "axios";

const app = express();
const PORT = 3000;

app.use(cors());
app.use(bodyParser.json());

const OPENAI_API_KEY = "";

app.post("/chat", async (req, res) => {
  try {
    const { prompt } = req.body;
    if (!prompt) return res.status(400).json({ error: "Thiếu prompt!" });

    const response = await axios.post(
      "https://api.openai.com/v1/chat/completions",
      {
        model: "gpt-4o-mini",
        messages: [{ role: "user", content: prompt }],
      },
      {
        headers: {
          "Content-Type": "application/json",
          Authorization: `Bearer ${OPENAI_API_KEY}`,
        },
      }
    );

    const message = response.data.choices[0].message.content.trim();
    res.json({ reply: message });
  } catch (error) {
    console.error("Lỗi API:", error.response?.data || error.message);
    res.status(500).json({
      error: error.response?.data || "Lỗi khi gọi OpenAI API",
    });
  }
});

app.listen(PORT, () => {
  console.log(`Server chạy tại: http://localhost:${PORT}`);
});
