import React from 'react';
import { FruitProvider } from './FruitContext';
import FruitInput from './FruitInput';
import FruitList from './FruitList';

function App() {
  return (
    <FruitProvider>
      <div style={{ padding: '20px' }}>
        <h1>Fruit Manager</h1>
        <FruitInput />
        <FruitList />
      </div>
    </FruitProvider>
  );
}

export default App;