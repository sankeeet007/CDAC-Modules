import React from 'react';
import './MovieTable.css'; 

const MovieTable = ({ movies }) => {
  if (movies.length === 0) {
    return <p className="empty-message">No movies added yet.</p>;
  }

  return (
    <div className="table-container">
      <h2>Movie List</h2>
      <table className="movie-table">
        <thead>
          <tr>
            <th>Movie Name</th>
            <th>Actor</th>
            <th>Release Date</th>
            <th>Movie Type</th>
            <th>State</th>
          </tr>
        </thead>
        <tbody>
          {movies.map((movie, index) => (
            <tr key={index}>
              <td>{movie.movieName}</td>
              <td>{movie.actor}</td>
              <td>{movie.release}</td>
              <td>{movie.movieType.join(', ')}</td>
              <td>{movie.state}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default MovieTable;