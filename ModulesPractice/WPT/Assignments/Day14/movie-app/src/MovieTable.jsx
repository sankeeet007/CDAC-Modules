import React from 'react';

const MovieTable = ({ movieData }) => {
  return (
    <div className="mt-5">
      <h3 className="mb-3 text-secondary">Database Records</h3>
      <div className="table-responsive">
        <table className="table table-striped table-hover border">
          <thead className="table-dark">
            <tr>
              <th>#</th>
              <th>Movie Name</th>
              <th>Actor</th>
              <th>Release Date</th>
              <th>Formats</th>
              <th>Status</th>
            </tr>
          </thead>
          <tbody>
            {movieData.length > 0 ? (
              movieData.map((movie, index) => (
                <tr key={index}>
                  <td>{index + 1}</td>
                  <td className="fw-bold text-capitalize">{movie.movieName}</td>
                  <td>{movie.actor}</td>
                  <td>{movie.releaseDate || 'N/A'}</td>
                  <td>
                    {movie.movieType.map((type, i) => (
                      <span key={i} className="badge bg-info text-dark me-1">{type}</span>
                    ))}
                  </td>
                  <td>
                    <span className={`badge ${movie.state === 'Released' ? 'bg-success' : 'bg-warning text-dark'}`}>
                      {movie.state}
                    </span>
                  </td>
                </tr>
              ))
            ) : (
              <tr>
                <td colSpan="6" className="text-center text-muted py-4">
                  No movies added yet. Fill out the form above to get started.
                </td>
              </tr>
            )}
          </tbody>
        </table>
      </div>
    </div>
  );
};

export default MovieTable;