import React, { useState } from 'react';
import MovieTable from './MovieTable';

const MovieManager = () => {
  const [movies, setMovies] = useState([]);
  const [formData, setFormData] = useState({
    movieName: '',
    actor: '',
    releaseDate: '',
    movieType: [],
    state: ''
  });

  const handleInputChange = (e) => {
    const { name, value, type, checked } = e.target;
    if (type === 'checkbox') {
      const updatedTypes = checked
        ? [...formData.movieType, value]
        : formData.movieType.filter((t) => t !== value);
      setFormData({ ...formData, movieType: updatedTypes });
    } else {
      setFormData({ ...formData, [name]: value });
    }
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    if (!formData.movieName) return;
    setMovies([...movies, formData]);
    setFormData({ movieName: '', actor: '', releaseDate: '', movieType: [], state: '' });
  };

  return (
    <div className="container mt-5">
      <div className="card shadow p-4">
        <h2 className="text-center mb-4 text-primary">Movie Entry Form</h2>
        <form onSubmit={handleSubmit}>
          <div className="row g-3">
            {/* Movie Name */}
            <div className="col-md-6">
              <label className="form-label">Movie Name</label>
              <input 
                type="text" className="form-control" name="movieName" 
                value={formData.movieName} onChange={handleInputChange} required 
              />
            </div>

            {/* Actor */}
            <div className="col-md-6">
              <label className="form-label">Lead Actor</label>
              <input 
                type="text" className="form-control" name="actor" 
                value={formData.actor} onChange={handleInputChange} 
              />
            </div>

            {/* Release Date */}
            <div className="col-md-6">
              <label className="form-label">Release Date</label>
              <input 
                type="date" className="form-control" name="releaseDate" 
                value={formData.releaseDate} onChange={handleInputChange} 
              />
            </div>

            {/* State (Select) */}
            <div className="col-md-6">
              <label className="form-label">Status</label>
              <select className="form-select" name="state" value={formData.state} onChange={handleInputChange}>
                <option value="">Choose status...</option>
                <option value="Released">Released</option>
                <option value="Upcoming">Upcoming</option>
              </select>
            </div>

            {/* Movie Type (Checkboxes) */}
            <div className="col-12 mt-3">
              <label className="form-label d-block">Viewing Formats:</label>
              {['2D', '3D', 'IMAX'].map((type) => (
                <div key={type} className="form-check form-check-inline">
                  <input 
                    className="form-check-input" type="checkbox" 
                    value={type} checked={formData.movieType.includes(type)} 
                    onChange={handleInputChange} 
                  />
                  <label className="form-check-label">{type}</label>
                </div>
              ))}
            </div>

            <div className="col-12 text-center mt-4">
              <button type="submit" className="btn btn-primary px-5">Add Movie</button>
            </div>
          </div>
        </form>
      </div>

      {/* Table Component Call */}
      <MovieTable movieData={movies} />
    </div>
  );
};

export default MovieManager;