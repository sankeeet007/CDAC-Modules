import React, { createContext, useState } from 'react';

// Create the Context
export const FruitContext = createContext();

export const FruitProvider = ({ children }) => {
  const [fruits, setFruits] = useState(['Apple', 'Banana']);

  const addFruit = (name) => {
    setFruits([...fruits, name]);
  };

  return (
    <FruitContext.Provider value={{ fruits, addFruit }}>
      {children}
    </FruitContext.Provider>
  );
};