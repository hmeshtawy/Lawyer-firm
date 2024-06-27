import { IAuthority, NewAuthority } from './authority.model';

export const sampleWithRequiredData: IAuthority = {
  name: '1f8a0ab9-42a5-49e5-a627-7498dd53a4b3',
};

export const sampleWithPartialData: IAuthority = {
  name: '19cb4808-43ea-4939-94c8-208ea8d6bdb7',
};

export const sampleWithFullData: IAuthority = {
  name: '0f4f8cc7-21a7-44f1-b9b8-b8377a694ad3',
};

export const sampleWithNewData: NewAuthority = {
  name: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
