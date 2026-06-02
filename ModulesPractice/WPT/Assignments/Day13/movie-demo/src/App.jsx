import React, { useState } from 'react';
import MovieTable from './MovieTable';
import './App.css'; // Import the CSS file

const App = () => {
  const initialFormState = {
    movieName: '',
    actor: '',
    release: '',
    movieType: [],
    state: ''
  };

  const [movies, setMovies] = useState([]);
  const [formData, setFormData] = useState(initialFormState);

  const handleInputChange = (e) => {
    const { name, value } = e.target;
    setFormData({
      ...formData,
      [name]: value
    });
  };

  const handleCheckboxChange = (e) => {
    const { value, checked } = e.target;
    let updatedMovieTypes = [...formData.movieType];

    if (checked) {
      updatedMovieTypes.push(value);
    } else {
      updatedMovieTypes = updatedMovieTypes.filter((type) => type !== value);
    }

    setFormData({
      ...formData,
      movieType: updatedMovieTypes
    });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    
    if (!formData.movieName || !formData.actor || !formData.state) {
      alert("Please fill out the required fields!");
      return;
    }

    setMovies([...movies, formData]);
    setFormData(initialFormState);
  };

  return (
    <div className="app-container">
      <h1>Add a New Movie</h1>
      
      <form onSubmit={handleSubmit} className="movie-form">
        
        <label>
          <strong>Movie Name:</strong>
          <input 
            type="text" 
            name="movieName" 
            className="form-input"
            value={formData.movieName} 
            onChange={handleInputChange} 
            required 
          />
        </label>

        <label>
          <strong>Actor:</strong>
          <input 
            type="text" 
            name="actor" 
            className="form-input"
            value={formData.actor} 
            onChange={handleInputChange} 
            required 
          />
        </label>

        <label>
          <strong>Release Date:</strong>
          <input 
            type="date" 
            name="release" 
            className="form-input"
            value={formData.release} 
            onChange={handleInputChange} 
            required 
          />
        </label>

        <div>
          <strong>Movie Type:</strong>
          <div className="checkbox-group">
            <label>
              <input 
                type="checkbox" 
                value="2D" 
                checked={formData.movieType.includes('2D')}
                onChange={handleCheckboxChange} 
              /> 2D
            </label>
            <label>
              <input 
                type="checkbox" 
                value="3D" 
                checked={formData.movieType.includes('3D')}
                onChange={handleCheckboxChange} 
              /> 3D
            </label>
            <label>
              <input 
                type="checkbox" 
                value="IMAX" 
                checked={formData.movieType.includes('IMAX')}
                onChange={handleCheckboxChange} 
              /> IMAX
            </label>
          </div>
        </div>

        <label>
          <strong>State:</strong>
          <select 
            name="state" 
            className="form-select"
            value={formData.state} 
            onChange={handleInputChange} 
            required
          >
            <option value="">-- Select a State --</option>
            <option value="Maharashtra">Maharashtra</option>
            <option value="Karnataka">Karnataka</option>
            <option value="Madhya Pradesh">Madhya Pradesh</option>
            <option value="Uttar Pradesh">Uttar Pradesh</option>
            <option value="Himachal Pradesh">Himachal Pradesh</option>
          </select>
        </label>

        <button type="submit" className="submit-btn">
          Submit Movie
        </button>
      </form>

      <hr className="divider" />

      <MovieTable movies={movies} />
    </div>
  );
};

export default App;