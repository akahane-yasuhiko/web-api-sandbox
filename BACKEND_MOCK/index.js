const express = require('express')
const fs = require('fs')
const app = express()
const port = 3000

app.get('/', (req, res) => {
  res.send('Hello World!')
})

app.get('/users/:userId', (req, res) => {
  res.send(req.params)
})

app.get('/users', (req, res) => {
  data = fs.readFileSync('data/users.json')
  jsonData = JSON.parse(data)
  res.send(jsonData)
})

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})