import React, { useState, useContext } from 'react';
import { FruitContext } from './FruitContext';

const FruitInput = () => {
  const [inputValue, setInputValue] = useState('');
  const { addFruit } = useContext(FruitContext);

  const handleSubmit = (e) => {
    e.preventDefault();
    if (inputValue.trim()) {
      addFruit(inputValue);
      setInputValue('');
    }
  };

  return (
    <form onSubmit={handleSubmit}>
      <input 
        type="text" 
        value={inputValue} 
        onChange={(e) => setInputValue(e.target.value)} 
        placeholder="Enter a fruit..."
      />
      <button type="submit">Add Fruit</button>
    </form>
  );
};

export default FruitInput;