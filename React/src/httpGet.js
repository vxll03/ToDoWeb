import api from "./api.js";

async function fetchData(uri) {
  try {
    const response = await api.get(`${uri}`);
    return response.data;
  } catch (error) {
    console.error("Ошибка при получении данных : ", error);
  }
}

export default fetchData;
