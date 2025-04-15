import './App.css'
import LandingPage from './pages/LandingPage.jsx';
import { Routes, Route } from 'react-router';

function App() {

  return (
    <Routes>
      <Route path="/" element={<LandingPage />} />
    </Routes>
  )
}

export default App
