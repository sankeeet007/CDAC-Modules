import React, { useContext } from 'react';
import { FruitContext } from './FruitContext';

const FruitList = () => {
  const { fruits } = useContext(FruitContext);

  return (
    <ul>
      {fruits.map((fruit, index) => (
        <li key={index}>{fruit}</li>
      ))}
    </ul>
  );
};

export default FruitList;